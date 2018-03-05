package com.example.maciej.music3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class playlisty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<String> words = new ArrayList<>();
        words.add("Pierwsza");
        words.add("Druga");
        words.add("Trzecia");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.element_listy, words);
        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent SongList = new Intent(playlisty.this, SongList.class);
                SongList.putExtra("position",position);
                startActivity(SongList);
            }
        });
    }

}
