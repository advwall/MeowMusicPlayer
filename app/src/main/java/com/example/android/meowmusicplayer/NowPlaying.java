package com.example.android.meowmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlaying {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the now_playing.xml layout file.
            setContentView(R.layout.now_playing);

        // Find the views that shows the  Now Playing activity.
        TextView albumListView = (TextView) findViewById(R.id.text_container);

        // Set a click listener on Albums activity selection button
        albumCategoryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(NowPlaying.this, NowPlaying.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on Songs activity selection button
        songsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlayingActivity.this, SongsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on playlists activity selection button
        playListsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlayingActivity.this, PlaylistsActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

}
