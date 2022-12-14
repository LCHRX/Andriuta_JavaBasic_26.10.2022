package com.hillel.andriuta.homework.hw10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayComp = new int[7];
        int[] arrayPl = new int[7];

        for (int i = 0; i < arrayComp.length; i++) {
            arrayComp[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < arrayPl.length; i++) {
            arrayPl[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arrayComp);
        Arrays.sort(arrayPl);
        System.out.println("Виграшний білет: " + Arrays.toString(arrayComp));
        System.out.println("Ваш білет: " + Arrays.toString(arrayPl));

        int match = 0;

        for (int i = 0; i < arrayComp.length; i++) {
            if (arrayComp[i] == arrayPl[i] && i < arrayComp.length) {
                match++;
            }
        }



        System.out.println("Кількість збігів: " + match + ".");
        if (match > 0){
            System.out.print("Збіг в ячейках: ");
        }
        int j = match;
        for (int i = 0; i < arrayComp.length; i++) {
            if (j > 1 && arrayPl[i] == arrayComp[i]){
                System.out.print(++i + ", ");
                i--;
                j--;
                }else if (arrayPl[i] == arrayComp[i] && j == 1){
                System.out.println(++i + ".");
            }
            }

        }
    }

