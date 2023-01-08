package com.hillel.andriuta.lessons.lesson13.main.participants;

public class Dog extends Participant {


    public Dog(String name, int age) {
        super(name, age);
    }

public void demo(){
    System.out.println("demo");
}

@Override
    public void run() {
        System.out.println("Dog " + getName() + " runs");
    }

@Override
    public void swim() {
        System.out.println("Dog " + getName() + " swims");
    }
}
