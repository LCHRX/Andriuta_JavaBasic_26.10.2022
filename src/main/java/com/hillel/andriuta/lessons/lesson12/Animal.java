package com.hillel.andriuta.lessons.lesson12;

public class Animal extends Object{

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run(){
        System.out.println("Animal runs");
    }



}
