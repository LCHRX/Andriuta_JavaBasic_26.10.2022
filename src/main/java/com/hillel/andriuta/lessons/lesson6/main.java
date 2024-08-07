package com.hillel.andriuta.lessons.lesson6;

import com.hillel.andriuta.homework.hw1.HelloWorld;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = -1;
        System.out.println("Please enter factorial number (from 1 to 10): ");
        while (true){
            if (scanner.hasNextInt()) {
                factorial = scanner.nextInt();
                if (factorial >= 1 && factorial <= 10){
                    break;
                } else {
                    System.out.println("Number shoulde be from 1 to 10");
                }
            } else {
                System.out.println("wrong data, try again");
            }
            scanner.nextLine();
        }
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        System.out.println(factorial + "!=" + result );
   /* int n1 = 0;
    int n2 = 1;
    int sum;
        System.out.print(n1 + ", " + n2 + ", ");
        for (int i = 0; i < 9 ; i ++) {
            sum = n1 + n2;
            System.out.print((i < 8) ? sum + ", " : sum);
            n1 = n2;
            n2 = sum;
        }*/
     /*   int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;*/
        /*int i = 10;
        while (i >= 0) {

            System.out.println("countdown: " + i);
            if (i == 0) {
                System.out.println("bomb went off");
                break;
            }
            int defuse = (int) (Math.random() * 101);
            if (defuse >= 85 && defuse <= 100) {
                System.out.println("Bomb has been defused");
                System.out.println("Code was " + defuse);
                break;
            }
            i--;
        }*/


    }
}


