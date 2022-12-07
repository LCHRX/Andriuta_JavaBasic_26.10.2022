package com.hillel.andriuta.homework.hw6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Team 1 name");
        String t1Name =  scanner.nextLine();

        System.out.println("Enter player1 stat");
        int player1T1 = scanner.nextInt();

        System.out.println("Enter player2 stat");
        int player2T1 = scanner.nextInt();

        System.out.println("Enter player3 stat");
        int player3T1 = scanner.nextInt();

        System.out.println("Enter player4 stat");
        int player4T1 = scanner.nextInt();

        System.out.println("Enter player5 stat");
        int player5T1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Team 2 name");
        String t2Name = scanner.nextLine();

        System.out.println("Enter player1 stat");
        int player1T2 = scanner.nextInt();

        System.out.println("Enter player2 stat");
        int player2T2 = scanner.nextInt();

        System.out.println("Enter player3 stat");
        int player3T2 = scanner.nextInt();

        System.out.println("Enter player4 stat");
        int player4T2 = scanner.nextInt();

        System.out.println("Enter player5 stat");
        int player5T2 = scanner.nextInt();

        int t1Res = player1T1 + player2T1 + player3T1 + player4T1 + player5T1;
        int t2Res = player1T2 + player2T2 + player3T2 + player4T2 + player5T2;
        double t1Avg = (double) t1Res / 5;
        double t2Avg = (double) t2Res / 5;

        if (t1Avg > t2Avg){
            System.out.println(t1Name + " wins with " + t1Res + " points");
        } else if (t1Avg < t2Avg){
            System.out.println(t2Name + " wins with " + t2Res + " points");
        } else {
            System.out.println("Draw");
        }

    }
}
