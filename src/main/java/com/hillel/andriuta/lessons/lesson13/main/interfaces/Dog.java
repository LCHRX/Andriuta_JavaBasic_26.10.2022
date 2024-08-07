package com.hillel.andriuta.lessons.lesson13.main.interfaces;

import com.hillel.andriuta.lessons.lesson13.main.participants.Participant;

public class Dog extends Animal implements Runnable, Swimmable{

    public static int staticIntVar = 100;

    public Dog(String name, int age) {

        super(name, age);
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }

    @Override
    public void run() {
        System.out.println("Dog " + name + " runs");
    }

    @Override
    public void swim() {
        System.out.println("Dog " + name + " swims");
    }

    @Override
    public void defMethod() {
        Runnable.super.defMethod();
    }
}
