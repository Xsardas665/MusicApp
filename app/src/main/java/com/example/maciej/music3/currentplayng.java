package com.example.maciej.music3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class currentplayng extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currentplaying);
        Intent intent = getIntent();
        String Autor = intent.getStringExtra("Autor");
        String Track = intent.getStringExtra("Track");
        TextView Wykonawca = findViewById(R.id.wykonawca);
        Wykonawca.setText(Autor);
        TextView Piosenka = findViewById(R.id.utwor);
        Piosenka.setText(Track);
    }
}
