package com.example.maciej.music3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Maciej on 02.03.2018.
 */

public class current extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currentplaying);

        TextView utwor = findViewById(R.id.utwor);
        utwor.setText("Title");

        TextView wykonawca = findViewById(R.id.wykonawca);
        wykonawca.setText("Author");
    }
}
