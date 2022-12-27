package com.hillel.andriuta.homework.hw13;

public class Burger {

    String bun;
    String patty;
    String secondPatty;
    String lettuce;
    String sauce;

    String cheese;

    public Burger(String bun, String patty, String lettuce, String sauce, String cheese) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.sauce = sauce;
        this.cheese = cheese;
        System.out.println("Standard burger ingredients: " + bun + ", " + patty + ", " + lettuce + ", " + sauce + ", " + cheese);
    }

    public Burger(String bun, String patty, String secondPatty, String lettuce, String sauce, String cheese) {
        this.bun = bun;
        this.patty = patty;
        this.secondPatty = secondPatty;
        this.lettuce = lettuce;
        this.sauce = sauce;
        this.cheese = cheese;
        System.out.println("Double burger ingredients: " + bun + ", " + patty + ", " + secondPatty + ", " + lettuce + "," + sauce + ", " + cheese);
    }

    public Burger(String bun, String patty, String lettuce, String cheese) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.cheese = cheese;
        System.out.println("Diet burger ingredients: " + bun + ", " + patty + ", " + lettuce + ", " + cheese);

    }





}
