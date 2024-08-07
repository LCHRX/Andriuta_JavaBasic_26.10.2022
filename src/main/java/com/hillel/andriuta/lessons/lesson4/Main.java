package com.hillel.andriuta.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
//       double a = 5
//            double result = a - 5;
//        Syst\em.out.println(result
        int a = 2;
        int b = -3;
        int c = 16;
//        double result = (double) Math.abs(a-b)/(a+b)*3-Math.sqrt(c);
//        System.out.println(result);
        double result = (double) (a+b) / 12 * c % 4 + Math.abs(b);
        System.out.println(result);
    }
}
