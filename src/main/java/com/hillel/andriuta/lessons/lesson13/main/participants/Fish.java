package com.hillel.andriuta.lessons.lesson13.main.participants;

public class Fish extends Participant {
    @Override
    public void run() {
        System.out.println("Fish " + getName() + " can't run");
    }

    @Override
    public void swim() {
        System.out.println("Fish " + getName() + " swims");
    }

    public Fish(String name, int age) {
        super(name, age);
    }
}
