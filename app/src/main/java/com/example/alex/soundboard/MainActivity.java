package com.example.alex.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){
        int id = view.getId();
        String ourId = "";


        ourId = view.getResources().getResourceEntryName(id);
        Log.i("Button tapped", ourId);
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.alex.soundboard");
        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
