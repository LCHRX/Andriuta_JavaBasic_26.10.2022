package com.hillel.andriuta.homework.hw16.Music.Styles;

import com.hillel.andriuta.homework.hw16.Music.MusicStyles;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " playing rock");
    }
}
