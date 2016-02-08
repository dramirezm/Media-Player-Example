package com.ramirez.diego.audiopractice;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnStart, btnPause,btnStop;
    MediaPlayer mediaPlayer;
    int pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void startMusic(View v)
    {
        Log.e("Method", "startMusic()");
        if (mediaPlayer == null)
        {
            mediaPlayer = MediaPlayer.create(this,R.raw.stan);
            mediaPlayer.start();
        }
        else
        {
            mediaPlayer.start();
            mediaPlayer.seekTo(pause);
        }

    }

    public void pauseMusic(View v)
    {
        Log.e("Method","pauseMusic()");
        mediaPlayer.pause();
        pause = mediaPlayer.getCurrentPosition();


    }
    public void stopMusic(View v) {
        Log.e("Method","stopMusic()");
        mediaPlayer.release();
        mediaPlayer = null;
    }




}
