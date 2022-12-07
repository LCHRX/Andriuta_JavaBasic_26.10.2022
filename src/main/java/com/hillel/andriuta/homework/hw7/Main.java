package com.hillel.andriuta.homework.hw7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        int attempts = 10;
        int i = attempts;
        System.out.println("Please enter the number(You have " + i + " attempts left)");
        while (i > 0) {
           if (scanner.hasNextInt()) {
               int b = scanner.nextInt();
               if (b == a) {
                   System.out.println("You guessed the number! Congrats");
                   break;
               } else if (b > 10 || b < 0) {
                   System.out.println("Enter a number from 1 to 10!");
                   continue;
               } else if (b < a && i != 1) {
                   System.out.println("The number is greater than your guess. You have " + (i - 1) + " attempts left.");
               } else if (b > a && i != 1) {
                   System.out.println("The number is lesser than your guess. You have " + (i - 1) + " attempts left.");
               }
               if (i == 1 && b != a) {
                   System.out.println("You lost!");
                   break;
               }
               i--;
           }
           else {
                System.out.println("Wrong data, try again");
                scanner.next();
            }
        }
        System.out.println("Your number was: " + a);
    }
}




