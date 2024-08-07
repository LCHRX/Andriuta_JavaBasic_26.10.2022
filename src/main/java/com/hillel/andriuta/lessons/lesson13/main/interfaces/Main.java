package com.hillel.andriuta.lessons.lesson13.main.interfaces;

public class Main {
    public static void main(String[] args) {

        System.out.println(Dog.staticIntVar);
        System.out.println(Dog.DISTANCE);

        Dog.staticMethod();


        Dog dog1 = new Dog("Johny1", 5);
        Dog dog2 = new Dog("Johny2", 5);
        Dog dog3 = new Dog("Johny3", 5);

        System.out.println(dog1.staticIntVar);
        System.out.println(dog2.staticIntVar);
        System.out.println(dog3.staticIntVar);

        Dog.staticIntVar = 150;

        System.out.println(dog1.staticIntVar);
        System.out.println(dog2.staticIntVar);
        System.out.println(dog3.staticIntVar);

        dog1.defMethod();
    }
}
