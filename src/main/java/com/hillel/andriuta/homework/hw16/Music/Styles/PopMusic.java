package com.hillel.andriuta.homework.hw16.Music.Styles;

import com.hillel.andriuta.homework.hw16.Music.MusicStyles;

public class PopMusic extends MusicStyles {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " playing pop");;
    }
}
