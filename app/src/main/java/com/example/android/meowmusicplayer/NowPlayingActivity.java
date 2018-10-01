package com.example.android.meowmusicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class NowPlayingActivity extends AppCompatActivity {

    ImageView albumArt = findViewById(R.id.albumArt);
    SeekBar seekbar = findViewById(R.id.seekbar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        setTitle(R.string.nowPlaying);

        // Find the View that shows the artist category
        ImageButton endNowPlayingButton = findViewById(R.id.exit_playing);
        endNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent mainActivityIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainActivityIntent);
            }
        });






        Button playButton = findViewById(R.id.play_btn);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });

        Button pauseButton = findViewById(R.id.pause_btn);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });

        Button stopButton = findViewById(R.id.stop_btn);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "onItemClick", Toast.LENGTH_LONG).show();
            }
        });

    }
}

