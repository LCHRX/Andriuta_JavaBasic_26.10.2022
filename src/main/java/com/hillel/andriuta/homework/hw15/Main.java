package com.hillel.andriuta.homework.hw15;

import com.hillel.andriuta.homework.hw15.Phones.Androids;
import com.hillel.andriuta.homework.hw15.Phones.Iphones;

public class Main {
    public static void main(String[] args) {

    Androids samsungG7 = new Androids("Samsung", "Galaxy 7");
    Iphones iphoneXS = new Iphones("iPhone", "XS");

    samsungG7.startup();
    samsungG7.UI();
    samsungG7.showMobileInfo();
    samsungG7.call();
    samsungG7.sms();
    samsungG7.internet();

    System.out.println();

    iphoneXS.startup();
    iphoneXS.UI();
    iphoneXS.showMobileInfo();;
    iphoneXS.call();
    iphoneXS.sms();
    iphoneXS.internet();




}
    }
