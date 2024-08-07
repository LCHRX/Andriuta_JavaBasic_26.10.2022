package com.hillel.andriuta.lessons.lesson11;

public class Person {

    //global variables
    String name;
    String phoneNumber;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "NAME";
        age = 99;

        System.out.println("Test");

    }

    public Person(int age) {
        this.age = age;
    }

    void printName(){
        String name = "qwerty";
        System.out.println("name: " + this.name);
    }

    void sayHello(){
        String name = "qwerty";
        System.out.println(name + " say hello");
    }

    int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
