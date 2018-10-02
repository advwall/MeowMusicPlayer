package com.example.android.meowmusicplayer;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

/**
 * This app uses umano SlidingUpPanel.
 * https://github.com/umano/AndroidSlidingUpPanel
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private SlidingUpPanelLayout Layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setTitle(R.string.app_name);

        // Find the View that shows the songs category
        TextView songsView = findViewById(R.id.songs);
        songsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the artist category
        TextView artistView = findViewById(R.id.artists);
        artistView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albumsView = findViewById(R.id.albums);
        albumsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        Layout = findViewById(R.id.sliding_layout);
        Layout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                Log.i(TAG, "onPanelSlide, offset " + slideOffset);

            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                Log.i(TAG, "onPanelStateChanged " + newState);
            }
        });

        Layout.setFadeOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Layout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);

            }
        });

        // Find the button which plays the available audio
        final Button playButton = findViewById(R.id.play_btn);
        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Plays audio
                Log.i(TAG, "Play Audio");
            }
        });

        // Find the button which plays the available audio
        final Button pauseButton = findViewById(R.id.pause_btn);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Pauses the audio
                Log.i(TAG, "Pause Audio");
            }
        });

        // Find the button which plays the available audio
        final Button stopButton = findViewById(R.id.stop_btn);
        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Stops the audio
                Log.i(TAG, "Stop Audio");
            }
        });

        // Find the button which plays the available audio
        final ImageButton exitPlayingButton = findViewById(R.id.exit_playing);
        exitPlayingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Layout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);

            }
        });

    }

    //These methods tell the options menu what to do.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.settings_one: {
                Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songsIntent);
                Log.i(TAG, "Songs Activity");
                return true;
            }

            case R.id.settings_two: {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
                Log.i(TAG, "Artists Activity");
                return true;
            }

            case R.id.settings_three: {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
                Log.i(TAG, "Albums Activity");
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (Layout != null &&
                (Layout.getPanelState() == SlidingUpPanelLayout.PanelState.EXPANDED || Layout.getPanelState() == SlidingUpPanelLayout.PanelState.ANCHORED)) {
            Layout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        } else {
            super.onBackPressed();
        }
    }
}


