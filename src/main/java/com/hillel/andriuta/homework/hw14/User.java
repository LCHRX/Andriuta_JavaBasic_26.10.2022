package com.hillel.andriuta.homework.hw14;

public class User {

   final String name;
    final int birthDay;
    final int birthMonth;
    final int birthYear;
    final String email;
    final String phone;

    String lastName;
    int weight;
    int pressure;
    int steps;

    int age;



    public User(String name, int birthDay, int birthMonth, int birthYear, String email, String phone, String lastName, int weight, int pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;

    }


    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.print("Name: " + getName() + " ");
        System.out.println(lastName);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps walked: " + steps);
        System.out.print("Birthday: " + getBirthDay() + ".");
        System.out.print(getBirthMonth() + ".");
        System.out.println(getBirthYear());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());

        if (birthDay < 8 && birthMonth == 1){
            age = 2023 - birthYear;
        } else {
            age = 2023 - birthYear - 1;
        }

        System.out.println("Age: " + getAge());
        System.out.println();
    }


}
