package com.hillel.andriuta.homework.hw8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please be advised, only next numbers will be used in shuttle numeration:");
        int count = 0;
        for (int i = 1; count < 100; i++) {
            if (i != 4 && i != 9 && i % 10 != 4 && i % 10 != 9 & i / 10 != 4 && i / 10 != 9 && i / 10 != 14 && count <= 98) {
                System.out.print(i +", ");
                count++;
            }else if (i != 4 && i != 9 && i % 10 != 4 && i % 10 != 9 & i / 10 != 4 && i / 10 != 9 && i / 10 != 14 && count == 99){
                System.out.println(i + ".");
                count++;
            }

        }
        System.out.println("\nTotal ammount of shuttles: " + count);

    }
}
