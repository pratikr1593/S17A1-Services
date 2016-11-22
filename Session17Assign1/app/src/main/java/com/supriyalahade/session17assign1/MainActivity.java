package com.supriyalahade.session17assign1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.play_button);
        stop=(Button)findViewById(R.id.stop_button);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.play_button:
                Intent playIntent = new Intent(this,MyService.class);
                startService(playIntent);
                break;

            case R.id.stop_button:
                Intent stopIntent = new Intent(this,MyService.class);
                stopService(stopIntent);
                break;

        }

    }
}
