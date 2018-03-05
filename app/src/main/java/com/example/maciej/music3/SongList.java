package com.example.maciej.music3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class SongList extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);
        int id = intent.getIntExtra("id",-1);

        if (position == 0) {
            final ArrayList<Song> Playlista = new ArrayList<>();
            Playlista.add(new Song("Highway to Hell", "AC/DC"));
            Playlista.add(new Song("Stairway to Heaven", "Led Zeppelin"));
            Playlista.add(new Song("Enter Sandman", "Mettalica"));

            SongAdapter adapter = new SongAdapter(this, Playlista);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent SongList = new Intent(SongList.this, currentplayng.class);
                    String Author = Playlista.get(position).getWykonawca();
                    String Track = Playlista.get(position).getTytul();

                    SongList.putExtra("Autor", Author);
                    SongList.putExtra("Track", Track);
                    startActivity(SongList);
                }
            });

        }

        if (position == 1) {
            final ArrayList<Song> Playlista = new ArrayList<>();
            Playlista.add(new Song("Thunderstruck", "AC/DC"));
            Playlista.add(new Song("Nothing Else Matters", "Mettalica"));
            Playlista.add(new Song("Enter Sandman", "Mettalica"));

            SongAdapter adapter = new SongAdapter(this, Playlista);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent SongList = new Intent(SongList.this, currentplayng.class);
                    String Author = Playlista.get(position).getWykonawca();
                    String Track = Playlista.get(position).getTytul();

                    SongList.putExtra("Autor", Author);
                    SongList.putExtra("Track", Track);
                    startActivity(SongList);
                }
            });
        }

        if (position == 2) {
            final ArrayList<Song> Playlista = new ArrayList<>();
            Playlista.add(new Song("Back In Black", "AC/DC"));
            Playlista.add(new Song("Kashmir", "Led Zeppelin"));
            Playlista.add(new Song("Whiskey in the jar", "Mettalica"));

            SongAdapter adapter = new SongAdapter(this, Playlista);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent SongList = new Intent(SongList.this, currentplayng.class);
                    String Author = Playlista.get(position).getWykonawca();
                    String Track = Playlista.get(position).getTytul();

                    SongList.putExtra("Autor", Author);
                    SongList.putExtra("Track", Track);
                    startActivity(SongList);
                }
            });
        }

        if (id == 0) {
            final ArrayList<Song> Playlista = new ArrayList<>();
            Playlista.add(new Song("Highway to Hell", "AC/DC"));
            Playlista.add(new Song("Thunderstruck", "AC/DC"));
            Playlista.add(new Song("Back In Black", "AC/DC"));

            SongAdapter adapter = new SongAdapter(this, Playlista);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent SongList = new Intent(SongList.this, currentplayng.class);
                    String Author = Playlista.get(position).getWykonawca();
                    String Track = Playlista.get(position).getTytul();

                    SongList.putExtra("Autor", Author);
                    SongList.putExtra("Track", Track);
                    startActivity(SongList);
                }
            });
        }

        if (id == 1) {
            final ArrayList<Song> Playlista = new ArrayList<>();
            Playlista.add(new Song("Whiskey in the jar", "Mettalica"));
            Playlista.add(new Song("Nothing Else Matters", "Mettalica"));
            Playlista.add(new Song("Enter Sandman", "Mettalica"));

            SongAdapter adapter = new SongAdapter(this, Playlista);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent SongList = new Intent(SongList.this, currentplayng.class);
                    String Author = Playlista.get(position).getWykonawca();
                    String Track = Playlista.get(position).getTytul();

                    SongList.putExtra("Autor", Author);
                    SongList.putExtra("Track", Track);
                    startActivity(SongList);
                }
            });
        }

        if (id == 2) {
            final ArrayList<Song> Playlista = new ArrayList<>();
            Playlista.add(new Song("Stairway to Heaven", "Led Zeppelin"));
            Playlista.add(new Song("Kashmir", "Led Zeppelin"));

            SongAdapter adapter = new SongAdapter(this, Playlista);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent SongList = new Intent(SongList.this, currentplayng.class);
                    String Author = Playlista.get(position).getWykonawca();
                    String Track = Playlista.get(position).getTytul();

                    SongList.putExtra("Autor", Author);
                    SongList.putExtra("Track", Track);
                    startActivity(SongList);
                }
            });
        }
    }
}
