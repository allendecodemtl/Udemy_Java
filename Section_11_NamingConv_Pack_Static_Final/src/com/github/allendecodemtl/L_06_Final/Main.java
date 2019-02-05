package com.github.allendecodemtl.L_06_Final;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        // one.instanceNumber = 4; compile error -> cannot be changed after initialised
//
//        System.out.println(Math.PI);
//        //Math m = new Math();
//
//        int pwd = 674312;
//        Password newPassword = new Password(pwd);
//        newPassword.storePassword();
//
//        newPassword.letMeIn(1);
//        newPassword.letMeIn(252345);
//        newPassword.letMeIn(9773);
//        newPassword.letMeIn(0);
//        newPassword.letMeIn(-1);
//        newPassword.letMeIn(674312);
//
//
//        Password extPassword = new ExtendedPassword(pwd);
//        extPassword.storePassword();
//
//        extPassword.letMeIn(1);
//        extPassword.letMeIn(252345);
//        extPassword.letMeIn(9773);
//        extPassword.letMeIn(0);
//        extPassword.letMeIn(-1);
//        extPassword.letMeIn(674312);
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
