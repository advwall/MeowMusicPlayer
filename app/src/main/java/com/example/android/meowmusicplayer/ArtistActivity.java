package com.example.android.meowmusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ListView listView = findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArtistActivity.this, "You Clicked on an Artist!", Toast.LENGTH_SHORT).show();
            }
        });

        /* Create an array of words */
        ArrayList<MusicInformation> musicInfo = new ArrayList<MusicInformation>();

        //numbers.add("One");
        musicInfo.add(new MusicInformation("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Song 1", "Sample Artist", R.drawable.ic_album));
        musicInfo.add(new MusicInformation("Sample Song 1", "Sample Artist", R.drawable.ic_album));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, musicInfo, R.color.tabs);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}


