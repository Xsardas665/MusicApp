package com.example.maciej.music3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Maciej on 02.03.2018.
 */

public class wykonawcy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<String> words = new ArrayList<>();
        words.add("AC/DC");
        words.add("Mettalica");
        words.add("Led Zeppelin");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.element_listy, words);
        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent SongList = new Intent(wykonawcy.this, SongList.class);
                SongList.putExtra("id",position);
                startActivity(SongList);
            }
        });
    }
}
