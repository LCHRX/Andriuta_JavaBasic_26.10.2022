package com.hillel.andriuta.homework.hw14;

public class Main {
    public static void main(String[] args) {
        User Alex = new User("Alex", 3, 1, 2000, "alex123@gmail.com", "+3738456789", "Denver", 80, 140, 15000);
        User John = new User("John", 14, 8, 1995, "john123@gmail.com", "+3738498765", "Otaka", 85, 100, 5000);
        User Gina = new User("Gina", 18, 5, 1985, "gina123@gmail.com", "+3738555555", "Smith", 55, 95, 9000);
        User Igor = new User("Igor", 25, 6, 1999, "igor123@gmail.com", "+3738124578", "Zubrov", 75, 120, 8300);

        Alex.printAccountInfo();
        John.printAccountInfo();
        Gina.printAccountInfo();
        Igor.printAccountInfo();

        Alex.setSteps(10000);
        Alex.setWeight(85);
        Gina.setPressure(100);
        Gina.setSteps(7000);

        Alex.printAccountInfo();
        Gina.printAccountInfo();

    }


}
