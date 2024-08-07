package com.hillel.andriuta.lessons.lesson12;

public class DemoModifiers {

    public int publicVar;
    protected int protectedVar;
    int defVar;
    private int privateVar;

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

     void defMethod(){
        System.out.println("defMethod");
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }



}
