package com.hillel.andriuta.lessons.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  printHello();
        printHelloWithName("John");
        int x = 1;
        changeVariableValue(x);
        System.out.println(x);*/
        /* int [] array = {1, 2, 3, 4};
        System.out.println("Main " + Arrays.toString(array));

        changeArrayValue(array);

        System.out.println("Main " + Arrays.toString(array));*/

        /*int sum = getSum(1, 2, 3, 4, 5, 6);
        System.out.println(sum);
        demoRecursion(1);*/
        System.out.println(getFactorial(7));
    }

    static int getFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
  /*  static int demoRecursion(int x){
        System.out.println(x);
        return demoRecursion(++x);
    }*/




    //Varargs
/*    static int getSum(int... values) {

        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }








    static int demo(int a, int b){
        int result = demo(a, b, 0);
        return result;
    }

    static int demo(int a, int b, int c){
        int result = demo(a, b, c, 0);
        return result;
    }

    static int demo(int a, int b, int c, int d){
        return a + b + c + d;
    }


    static int getSum(int a, int b){
        *//*int sum = a + b;
        return sum;*//*
        return a + b;
    }

    static Scanner getScanner(){
        return new Scanner(System.in);
    }

    static void changeArrayValue(int[] array){
        array[0] = 99;
        System.out.println("New " + Arrays.toString(array));
    }

    static void printHello() {
        System.out.println("Hello");
    }

    static void printHelloWithName(String name){
        System.out.println("Hello " + name);
    }

    static void changeVariableValue(int x){
        x = 10;
        System.out.println(x);
    }
}*/
