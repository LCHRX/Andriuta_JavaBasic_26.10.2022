package com.hillel.andriuta.homework.hw5;

public class Main {
    public static void main(String[] args) {
        int war1 = 13;
        int arch1 = 24;
        int hman1 = 46;
        double dynLiAttackRate = (double) (war1 + arch1 + hman1) * 860 / 3;
        int war2 = 9;
        int arch2 = 35;
        int hman2 = 12;
        double dynMingAttackRate = (double) (war2 + arch2 + hman2) * (860 * 1.5) / 3;
        System.out.println("Рейтинг арміі династії Лінь = " + dynLiAttackRate);
        System.out.println("Рейтинг арміі династії Мінь = " + dynMingAttackRate);

    }
}
