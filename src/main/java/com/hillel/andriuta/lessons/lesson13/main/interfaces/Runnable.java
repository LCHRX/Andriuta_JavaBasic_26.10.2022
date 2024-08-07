package com.hillel.andriuta.lessons.lesson13.main.interfaces;

public interface Runnable {

    int DISTANCE = 10;

    void run();

    default void defMethod(){
        System.out.println("Default method");
    }

}
