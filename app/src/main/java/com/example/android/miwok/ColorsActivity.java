package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("chokokki","green",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("ṭopoppi", "gray",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("kululli", "black",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("kelelli", "white",R.drawable.color_white,R.raw.color_white));
        words.add(new Word("ṭopiisә", "dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("chiwiiṭә", "mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        AdapterClass flavorAdapter = new AdapterClass(this, words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ColorsActivity.this,"playing",Toast.LENGTH_SHORT).show();
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getSongId());
                mediaPlayer.start();
            }
        });
    }
}
