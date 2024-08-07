package com.hillel.andriuta.lessons.lesson13.main.obstacles;

import com.hillel.andriuta.lessons.lesson13.main.participants.Cat;
import com.hillel.andriuta.lessons.lesson13.main.participants.Dog;
import com.hillel.andriuta.lessons.lesson13.main.participants.Hamster;
import com.hillel.andriuta.lessons.lesson13.main.participants.Participant;

public class Pool extends Obstacle{


    @Override
    public void start(Participant participant) {
        participant.swim();
    }
}
