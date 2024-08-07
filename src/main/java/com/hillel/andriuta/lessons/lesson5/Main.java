package com.hillel.andriuta.lessons.lesson5;

public class Main {
    public static void main(String[] args) {
 /*       int a = 3;
        int b = 5;
        int c = 7;
        System.out.println((++a ==  --b) ? "True" : "False");*/
       /* System.out.println((int) (Math.random()*6));
        System.out.println((int) (Math.random()*6));
        System.out.println((int) (Math.random()*6));
        System.out.println((int) (Math.random()*6));
        System.out.println((int) (Math.random()*6));
        System.out.println((int) (Math.random()*6));
        System.out.println((int) (Math.random()*6));*/
        int a = (int) (Math.random() * 4);
        System.out.println(a);

        switch (a) {
            case 1:
                System.out.println("Turn On");
                break;
            case 2:
                System.out.println("Turn Off");
                break;
            case 3:
                System.out.println("Stand still");
                break;
            default:
                System.out.println("Do nothing");
                break;
        }

    }
}
