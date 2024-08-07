package com.hillel.andriuta.lessons.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length ; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


        /*int[] array = {1, 2, 3, 4, 5};
        int maxValue = array[0];
        for (int value : array) {
            maxValue = Math.max(maxValue, value);
        }
        System.out.println(maxValue);*/


     /*   int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));

        int maxValue = -1;
        for (int i = 0; i < array.length; i++) {
            maxValue = Math.max(maxValue, array[i]);
            }
        System.out.println(maxValue);
    }*/


      /*  int[] array = {1, 44, 98, 44, 22, 33, 55, 22, 98, 10};

        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            maxValue = Math.max(maxValue, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue){
                System.out.println("index: " + i + " chance: " + array[i]);
            }*/


       /* Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >=0 ; i--) {
            if (array[i] == array[array.length - 1]){
                System.out.println("index: " + i + " chance: " + array[i]);
        } else {
                break;
            }
        }*/

    }
static void demo(){
   /* int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
        array[i] =(int) (Math.random() * 11);
    }
    for (int i = 0; i < array.length; i++) {
        if (i < array.length - 1){
            System.out.print(array[i] + ", ");
        }
        else {
            System.out.print(array[i] + ".");
        }
    }*/

            /*int[] array = new int[5];
        System.out.println(array[3]);

        /*for (int i = 0; i < array.length;i++ ) {

          array[i] = i + 1;

        }

        System.out.println(Arrays.toString(array));*/
}
}
