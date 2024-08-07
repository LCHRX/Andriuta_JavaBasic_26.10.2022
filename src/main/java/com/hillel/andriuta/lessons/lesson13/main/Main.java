package com.hillel.andriuta.lessons.lesson13.main;

import com.hillel.andriuta.lessons.lesson13.main.participants.*;

public class Main {
    public static void main(String[] args) {

        Participant participant1 = new DogImpl("Johny", 10);
        Participant participant2 = new Hamster("Ham", 3);

        Dog dog = new Dog("Dog", 1);
        /*((Participant) dog).run();*/



         demo(participant1);
         demo(participant2);

    }

    public static void demo(Participant participant){
       /* if (participant instanceof Dog){
            *//*((Dog) participant).demo();*//*
            Dog dog = (Dog) participant;
            dog.demo();
        } else {
            participant.run();
        }*/

        if(participant.getClass() == Dog.class) {
            Dog dog = (Dog) participant;
            dog.demo();
        } else {
            participant.run();
        }

    }

}
