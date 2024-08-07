package com.hillel.andriuta.lessons.lesson13.main.participants;

public abstract class Participant {

    private String name;
    private int age;

    public abstract void run();

    public abstract void swim();

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
