package com.example.android.meowmusicplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;


public class MainActivity extends AppCompatActivity {

    private SlidingUpPanelLayout mLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

//        // Find the View that shows the numbers category
//        TextView nowPlayingView = (TextView) findViewById(R.id.now_playing);
//        nowPlayingView.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the "Now Playing" is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NowPlaying}
//                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
//
//                // Start the new activity
//                startActivity(nowPlayingIntent);
//            }
//        });

        // Find the View that shows the songs category
        TextView songsView = (TextView) findViewById(R.id.songs);
        songsView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the artist category
        TextView artistView = (TextView) findViewById(R.id.artists);
        artistView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView albumsView = (TextView) findViewById(R.id.albums);
        albumsView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });
    }

//    mLayout = (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
//        mLayout.addPanelSlideListener(new PanelSlideListener() {
//        @Override
//        public void onPanelSlide(View panel, float slideOffset) {
//            Log.i(TAG, "onPanelSlide, offset " + slideOffset);
//        }
//
//        @Override
//        public void onPanelStateChanged(View panel, PanelState previousState, PanelState newState) {
//            Log.i(TAG, "onPanelStateChanged " + newState);
//        }
//    });
//        mLayout.setFadeOnClickListener(new OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            mLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
//        }
//    });
//
//    TextView t = (TextView) findViewById(R.id.name);
//        t.setText(Html.fromHtml(getString(R.string.hello)));
//    Button f = (Button) findViewById(R.id.follow);
//        f.setText(Html.fromHtml(getString(R.string.follow)));
//        f.setMovementMethod(LinkMovementMethod.getInstance());
//        f.setOnClickListener(new OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("http://www.twitter.com/umanoapp"));
//            startActivity(i);
//        }
//    });
//}
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.demo, menu);
//        MenuItem item = menu.findItem(R.id.action_toggle);
//        if (mLayout != null) {
//            if (mLayout.getPanelState() == PanelState.HIDDEN) {
//                item.setTitle(R.string.action_show);
//            } else {
//                item.setTitle(R.string.action_hide);
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        return super.onPrepareOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.action_toggle: {
//                if (mLayout != null) {
//                    if (mLayout.getPanelState() != PanelState.HIDDEN) {
//                        mLayout.setPanelState(PanelState.HIDDEN);
//                        item.setTitle(R.string.action_show);
//                    } else {
//                        mLayout.setPanelState(PanelState.COLLAPSED);
//                        item.setTitle(R.string.action_hide);
//                    }
//                }
//                return true;
//            }
//            case R.id.action_anchor: {
//                if (mLayout != null) {
//                    if (mLayout.getAnchorPoint() == 1.0f) {
//                        mLayout.setAnchorPoint(0.7f);
//                        mLayout.setPanelState(PanelState.ANCHORED);
//                        item.setTitle(R.string.action_anchor_disable);
//                    } else {
//                        mLayout.setAnchorPoint(1.0f);
//                        mLayout.setPanelState(PanelState.COLLAPSED);
//                        item.setTitle(R.string.action_anchor_enable);
//                    }
//                }
//                return true;
//            }
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (mLayout != null &&
//                (mLayout.getPanelState() == PanelState.EXPANDED || mLayout.getPanelState() == PanelState.ANCHORED)) {
//            mLayout.setPanelState(PanelState.COLLAPSED);
//        } else {
//            super.onBackPressed();
//        }
//    }

}

