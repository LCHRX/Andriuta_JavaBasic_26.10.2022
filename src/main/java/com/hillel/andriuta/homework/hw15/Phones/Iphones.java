package com.hillel.andriuta.homework.hw15.Phones;

import com.hillel.andriuta.homework.hw15.Phones.OS.IOS;

public class Iphones implements Smartphones, IOS {

    private String name;
    private String model;


    public Iphones(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void call() {
        System.out.println("Ringing with 0.5 interval");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS");
    }

    @Override
    public void internet() {
        System.out.println("Connecting to LTE");
    }

    @Override
    public void showMobileInfo() {
        System.out.println("Your phone is " + getName() + getModel());
    }

    @Override
    public void startup() {
        System.out.println("iPhone startup theme");
    }

    @Override
    public void UI() {
        System.out.println("Gets iOS UI");
    }
}
