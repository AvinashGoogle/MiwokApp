package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("әpә","father",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("әṭa","mother",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("angsi","son",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("tune", "daughter",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("taachi", "older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("chalitti", "younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("teṭe", "older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("kolliti", "younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("ama", "grand mother",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("paapa", "grand father",R.drawable.family_grandfather,R.raw.family_grandfather));

        AdapterClass flavorAdapter = new AdapterClass(this, words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(FamilyMembersActivity.this,"playing",Toast.LENGTH_SHORT).show();
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(FamilyMembersActivity.this,word.getSongId());
                mediaPlayer.start();
            }
        });
    }
}
