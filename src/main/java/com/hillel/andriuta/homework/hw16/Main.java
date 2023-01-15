package com.hillel.andriuta.homework.hw16;

import com.hillel.andriuta.homework.hw16.Music.MusicStyles;
import com.hillel.andriuta.homework.hw16.Music.Styles.ClassicMusic;
import com.hillel.andriuta.homework.hw16.Music.Styles.PopMusic;
import com.hillel.andriuta.homework.hw16.Music.Styles.RockMusic;

public class Main {
    public static void main(String[] args) {

        /*new PopMusic("Harry Styles");
        new RockMusic("Mick Gordon");
        new ClassicMusic("Beethoven");*/

        MusicStyles[] performers = {new ClassicMusic("Beethoven"), new PopMusic("Harry Styles"), new RockMusic("Mick Gordon") };


        for (MusicStyles performer : performers) {
            performer.playMusic();

        }


    }


}
