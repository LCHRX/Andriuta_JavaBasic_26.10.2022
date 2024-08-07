package com.hillel.andriuta.lessons.lesson13.main.interfaces;

import com.hillel.andriuta.lessons.lesson13.main.participants.Participant;

public class Cat extends Animal implements Runnable, Swimmable {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " runs");
    }

    @Override
    public void swim() {
        System.out.println("Cat " + name + " swims");
    }
}
