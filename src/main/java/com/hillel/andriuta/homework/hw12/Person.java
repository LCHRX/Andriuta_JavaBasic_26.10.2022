package com.hillel.andriuta.homework.hw12;

public class Person {

            public static void main(String[] args) {
                personInfo("Will", "Smith","New York", "2936729462846");
                personInfo("Jackie", "Chan", "Shanghai", "12312412412");
                personInfo("Sherlock","Holmes","London","37742123513");
            }
            static String personInfo(String name, String surname, String city, String number){
                System.out.println("Зателефонувати громадянину " + name + " " + surname + " із міста " + city +" можна за номером " + number);
                return name + surname + city + number;

            }
        }

