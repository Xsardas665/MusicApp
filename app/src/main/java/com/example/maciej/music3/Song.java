package com.example.maciej.music3;

public class Song {

    private String Wykonawca;

    private String Tytul;


    public Song(String tytul, String wykonawca) {
        Wykonawca = wykonawca;
        Tytul = tytul;
    }


    public String getWykonawca() {
        return Wykonawca;
    }

    public String getTytul() {
        return Tytul;
    }

}
