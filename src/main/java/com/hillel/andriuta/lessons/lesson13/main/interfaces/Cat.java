package com.hillel.andriuta.lessons.lesson13.main.participants;

public class Cat extends Participant{


    public Cat(String name, int age) {
        super(name, age);
    }

    public void demo(){
        System.out.println("demo");
    }

@Override
    public void run() {
        System.out.println("Cat " + getName() + " runs");
    }

@Override
    public void swim() {
        System.out.println("Cat " + getName() + " swims");
    }
}
