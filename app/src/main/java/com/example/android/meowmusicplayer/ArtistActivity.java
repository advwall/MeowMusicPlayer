package com.example.android.meowmusicplayer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /* Create an array of words */
        ArrayList<Music> music = new ArrayList<Music>();

        //numbers.add("One");
        music.add(new Music("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        music.add(new Music("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        music.add(new Music("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        music.add(new Music("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        music.add(new Music("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        music.add(new Music("Sample Song 1", "Sample Artist", R.drawable.ic_album));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, music, R.color.tabs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}


