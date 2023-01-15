package com.hillel.andriuta.homework.hw16.Music;

public abstract class MusicStyles {

    private String name;
    public abstract void playMusic();

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

