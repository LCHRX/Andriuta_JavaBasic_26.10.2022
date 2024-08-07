package com.hillel.andriuta.lessons.lesson13.main;

import com.hillel.andriuta.lessons.lesson13.main.obstacles.Obstacle;
import com.hillel.andriuta.lessons.lesson13.main.obstacles.Pool;
import com.hillel.andriuta.lessons.lesson13.main.obstacles.RunningTrack;
import com.hillel.andriuta.lessons.lesson13.main.participants.*;

public class Competition {

    public static void main(String[] args) {

        Obstacle[] obstacles = {new Pool(), new RunningTrack()};

        Participant[] participants = {
                new Cat("Whity", 10),
                new Dog("Johny", 8),
                new Hamster("Ham", 3),
                new Fish("Chips", 2)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }

        }






    }
}
