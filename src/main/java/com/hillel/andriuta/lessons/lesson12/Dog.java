package com.hillel.andriuta.lessons.lesson12;

public class Dog extends Animal{

    int swimDistance;

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, int swimDistance) {
        super(name, age);
        this.swimDistance = swimDistance;
    }

    public void swim(){
        System.out.println("Dog " + name + " swims");
    }

    @Override
    public void run() {
        System.out.println("Dog " + name + " runs");
        super.run();
    }
}
