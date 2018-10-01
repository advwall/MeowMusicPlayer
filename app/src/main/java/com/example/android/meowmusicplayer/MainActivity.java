package com.example.android.meowmusicplayer;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
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

        // Find the View that shows the phrases category
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
        final Button playButton = (Button) findViewById(R.id.play_btn);
        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Log.i(TAG, "Play Audio");
            }
        });

        // Find the button which plays the available audio
        final Button pauseButton = (Button) findViewById(R.id.pause_btn);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Log.i(TAG, "Pause Audio");
            }
        });

        // Find the button which plays the available audio
        final Button stopButton = (Button) findViewById(R.id.stop_btn);
        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Log.i(TAG, "Stop Audio");
            }
        });

        // Find the button which plays the available audio
        final ImageButton exitPlayingButton = (ImageButton) findViewById(R.id.exit_playing);
        exitPlayingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Log.i(TAG, "Collapse Now Playing Activity");
            }
        });

    }

    //These methods tell the options menu what to do.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.settings_one);
        if (Layout != null) {
            if (Layout.getPanelState() == SlidingUpPanelLayout.PanelState.HIDDEN) {
                item.setTitle(R.string.settings_one);
            } else {
                item.setTitle(R.string.settings_two);
            }
        }
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings_three: {
                if (Layout != null) {
                    if (Layout.getPanelState() != SlidingUpPanelLayout.PanelState.HIDDEN) {
                        Layout.setPanelState(SlidingUpPanelLayout.PanelState.HIDDEN);
                        item.setTitle(R.string.settings_one);
                    } else {
                        Layout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
                        item.setTitle(R.string.settings_two);
                    }
                }
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


