package com.example.maciej.music3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.element_podwojny, parent, false);
        }


        Song currentSong = getItem(position);
        TextView tytol = (TextView) listItemView.findViewById(R.id.Tyt_tv);
        tytol.setText(currentSong.getTytul());

        TextView wykonawca = (TextView) listItemView.findViewById(R.id.wyk_tv);
        wykonawca.setText(currentSong.getWykonawca());

        return listItemView;
    }
}
