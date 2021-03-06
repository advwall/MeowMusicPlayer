package com.example.android.meowmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;


public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        setTitle(R.string.settings_three);

        ListView listView = findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(AlbumActivity.this, "You Clicked an Album!", Toast.LENGTH_SHORT).show();
            }
        });

        //Create an array of words
        ArrayList<MusicInformation> musicInfo = new ArrayList<>();

        musicInfo.add(new MusicInformation("Sample Album 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Album 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Album 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Album 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Album 1", "Sample Artist", R.drawable.ic_album));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each it em in the list.
        MusicAdapter adapter = new MusicAdapter(this, musicInfo, R.color.tabs);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
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
                // Create a new intent to open the {@link SongActivity}
                Intent songsIntent = new Intent(AlbumActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songsIntent);
                return true;
            }

            case R.id.settings_two: {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(AlbumActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
                return true;
            }

            case R.id.settings_three: {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumsIntent = new Intent(AlbumActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
