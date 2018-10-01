package com.example.android.meowmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class NowPlayingActivity extends AppCompatActivity {

    ImageView albumArt = findViewById(R.id.albumArt);
    TextView artistName = findViewById(R.id.playArtist);
    TextView songName = findViewById(R.id.playTrack);
    SeekBar seekbar = findViewById(R.id.seekbar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);


        final Button playButton = (Button) findViewById(R.id.play_btn);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });

        final ImageButton panelPlayButton = (ImageButton) findViewById(R.id.player_control);
        panelPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });

        final Button pauseButton = (Button) findViewById(R.id.pause_btn);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });

        final Button stopButton = (Button) findViewById(R.id.stop_btn);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });
    }
}

