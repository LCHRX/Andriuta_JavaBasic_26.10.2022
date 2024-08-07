package com.hillel.andriuta.lessons.lesson12;

import com.hillel.andriuta.lessons.lesson12test.test;

public class Main2 {
    public static void main(String[] args) {
        DemoModifiers demoModifiers = new DemoModifiers();
        System.out.println(demoModifiers.publicVar);
        System.out.println(demoModifiers.defVar);

        test test = new test();
        System.out.println();
    }
}
