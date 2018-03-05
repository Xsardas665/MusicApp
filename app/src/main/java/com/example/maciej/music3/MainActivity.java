package com.example.maciej.music3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playlisty = findViewById(R.id.playlisty);

        playlisty.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, playlisty.class);
                startActivity(playlistIntent);
            }}
        );

        TextView wykonawcy = findViewById(R.id.wykonawcy);

        wykonawcy.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent wykonawcyIntent = new Intent(MainActivity.this, wykonawcy.class);
                startActivity(wykonawcyIntent);
            }}
        );

        TextView current= findViewById(R.id.current);

        current.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent current = new Intent(MainActivity.this, current.class);
                startActivity(current);
            }}
        );
    }
}