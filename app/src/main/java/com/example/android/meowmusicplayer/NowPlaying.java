package com.example.android.meowmusicplayer;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    ImageView albumArt = findViewById(R.id.albumArt);
    TextView artistName = findViewById(R.id.playArtist);
    TextView songName = findViewById(R.id.playTrack);
    Button playButton = findViewById(R.id.play_btn);
    Button pauseButton = findViewById(R.id.pause_btn);
    Button stopButton = findViewById(R.id.stop_btn);
    SeekBar seekbar = findViewById(R.id.seekbar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Play", Toast.LENGTH_SHORT).show();
            }
        });
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Paused", Toast.LENGTH_SHORT).show();
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Stop", Toast.LENGTH_SHORT).show();
            }
        });

//        Intent i = getIntent();
//        String txt = i.getStringExtra("song");
//        TextView singerPlaying = findViewById(R.id.singerPlaying);
//        singerPlaying.setText(txt);
    }

    private void displayArtist (String artistName) {
        TextView nameArtist = findViewById(R.id.playArtist);
        nameArtist.setText(artistName);
    }

    private void displayTrack (String artistName) {
        TextView nameArtist = findViewById(R.id.playArtist);
        nameArtist.setText(artistName);
    }
}
