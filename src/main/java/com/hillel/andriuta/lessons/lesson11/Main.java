package com.hillel.andriuta.lessons.lesson11;

public class Main {
    public static void main(String[] args) {

        Person den = new Person("Den", 28);
        Person alex = new Person("Alex", 33);
        Person oleg = new Person("Oleg");


        System.out.println(den.toString());

        /*  oleg.printName();*/


        /*den.name = "Den";
        den.age = 28;


        den.printName();
        den.sayHello();
        System.out.println(den.getAge());*/

  /*      Person den = null;

        test(den);*/
    }


    static void test(Person person) {
        if (person != null) {
            person.sayHello();
        }

    }
}
