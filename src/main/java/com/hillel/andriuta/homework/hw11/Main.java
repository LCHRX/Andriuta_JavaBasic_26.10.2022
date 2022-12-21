package com.hillel.andriuta.homework.hw11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int M = 0;
        int N = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть кількість рядків");
            while (true) {
                if (scanner.hasNextInt()) {
                    M = scanner.nextInt();
                    if (M > 0) {
                        break;
                    } else {
                        System.out.println("Кількість рядків не може бути менше 1");
                    }
                } else {
                    System.out.println("Кількість рядків повинна бути цифрою");
                    scanner.next();
                }
            }
            System.out.println("Введіть кількість стовпців");
            while (true) {
                if (scanner.hasNextInt()) {
                    N = scanner.nextInt();
                    if (N > 0) {
                        break;
                    } else {
                        System.out.println("Кількість стовпців не може бути менше 1");
                    }
                } else {
                    System.out.println("Кількість стовпців повинна бути цифрою");
                    scanner.next();
                }
            }
            if (M > 1 || N > 1){
                break;
            } else {
                System.out.println("Матриця повинна мати мінімум 2 елемента");
            }
        }
        int[][] array1 = new int[M][N];
        int[][] array2 = new int[N][M];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("Ваша матриця");

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Транспонована матриця");
int temp;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0 ; j < array1[i].length; j++) {
                temp = array1[i][j];
                array2[j][i] = temp;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length ; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}