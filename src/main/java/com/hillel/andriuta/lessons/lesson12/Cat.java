package com.hillel.andriuta.lessons.lesson12;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("Cat " + name + " eats");
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " runs");
    }
}
