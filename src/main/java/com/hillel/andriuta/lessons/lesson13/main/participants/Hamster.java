package com.hillel.andriuta.lessons.lesson13.main.participants;

public class Hamster extends Participant {


    public Hamster(String name, int age) {
        super(name, age);
    }



@Override
    public void run() {
        System.out.println("Hamster " + getName() + " runs");
    }

@Override
    public void swim() {
        System.out.println("Hamster " + getName() + " swims");
    }

}
