package com.hillel.andriuta.homework.hw15.Phones;

import com.hillel.andriuta.homework.hw15.Phones.OS.LinuxOS;

public class Androids implements Smartphones, LinuxOS {
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Androids(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("Ringing with 0.3 interval");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS");
    }

    @Override
    public void internet() {
        System.out.println("Connecting to 4G");
    }

    @Override
    public void showMobileInfo() {
        System.out.println("Your phone is " + getName() + getModel());
    }

    @Override
    public void startup() {
        System.out.println("Android startup theme");
    }

    @Override
    public void UI() {
        System.out.println("Gets android UI");
    }
}
