package com.hillel.andriuta.homework.hw9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int t1Sum = 0;
        int t2Sum = 0;
        int plCount = 25;
        int[] team1 = new int[plCount];
        int[] team2 = new int[plCount];

        for (int i = 0; i < team1.length ; i++) {
            team1[i] = 40 - (int) (Math.random() * 23);
        }
        System.out.println("Вік гравців першої команди: ");
        for (int i = 0; i < team1.length; i++) {
            if (i < team1.length - 1) {
                System.out.print(team1[i] + ", ");
            } else {
                System.out.println(team1[i] + ".");
            }
        }
        for (int i = 0; i < team1.length; i++) {
             t1Sum = t1Sum + team1[i];
        }

        double t1Avg = (double) t1Sum / plCount;
        System.out.println("Середній вік гравців першої команди " +  t1Avg);
        System.out.println();


        for (int i = 0; i < team2.length ; i++) {
            team2[i] = 40 - (int) (Math.random() * 23);
        }
        System.out.println("Вік гравців другої команди: ");
        for (int i = 0; i < team2.length; i++) {
            if (i < team2.length - 1) {
                System.out.print(team2[i] + ", ");
            } else {
                System.out.println(team2[i] + ".");
            }
        }
        for (int i = 0; i < team2.length; i++) {
            t2Sum = t2Sum + team2[i];
        }

        double t2Avg = (double) t2Sum / plCount;
        System.out.println("Середній вік гравців другої команди " +  t2Avg);



    }
}
