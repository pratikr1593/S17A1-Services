package com.supriyalahade.session17assign1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    MediaPlayer mediaPlayer;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("My Service Application ","I am running in onCreate()");
        mediaPlayer = MediaPlayer.create(this,R.raw.sagarjaisiaankhonwali);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d("My Service Application ","I am running in onStartCommand()");

        if(!mediaPlayer.isPlaying()){

            mediaPlayer.start();
        }

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("My Service Application ","I am running in onDestroy()");

        mediaPlayer.stop();
        mediaPlayer.release();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
