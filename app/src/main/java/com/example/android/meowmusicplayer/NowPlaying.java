package com.example.android.meowmusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class NowPlaying extends AppCompatActivity implements View.OnClickListener {

    ImageView albumArt = findViewById(R.id.albumArt);
    TextView artistName = findViewById(R.id.playArtist);
    TextView songName = findViewById(R.id.playTrack);
    SeekBar seekbar = findViewById(R.id.seekbar);
    Button playButton, pauseButton, stopButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);


        playButton = (Button) findViewById(R.id.play_btn);
        playButton.setOnClickListener(this);

        pauseButton = (Button) findViewById(R.id.pause_btn);
        pauseButton.setOnClickListener(this);

        stopButton =(Button) findViewById(R.id.stop_btn);
        stopButton.setOnClickListener(this);



//        playButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(NowPlaying.this, "Play", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        pauseButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(NowPlaying.this, "Paused", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        stopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(NowPlaying.this, "Stop", Toast.LENGTH_LONG).show();
//            }
//        });

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.play_btn:
            {
                Toast.makeText(NowPlaying.this, "Play", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.pause_btn:
                Toast.makeText(NowPlaying.this, "Paused", Toast.LENGTH_LONG).show(); {
                    break;
            }
            case R.id.stop_btn:
                Toast.makeText(NowPlaying.this, "Stop", Toast.LENGTH_LONG).show(); {
                    break;
            }

        }
    }

}
