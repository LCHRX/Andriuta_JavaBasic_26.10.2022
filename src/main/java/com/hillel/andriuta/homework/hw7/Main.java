package com.hillel.andriuta.homework.hw7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("Please enter the number(You have " + i + " attempts left)");
            int b = scanner.nextInt();
            if (b == a) {
                System.out.println("You guessed the number! Congrats");
                break;
            } else {
                System.out.println("Wrong number");
            }
        }
        System.out.println(a);
    }
}
