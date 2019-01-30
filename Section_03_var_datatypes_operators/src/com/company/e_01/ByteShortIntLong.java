package com.company.e_01;

public class ByteShortIntLong {

    public static void main(String[] args) {
        tutorial();
        exercise();
    }

    private static void exercise() {
        byte b = 120;
        short s = 100;
        int i = 1000;
        long l = 5000L + 10L * (b + s + i);
        short sTotal = (short) (5000L + 10L * (b + s + i));

        System.out.println(l);
        System.out.println(sTotal);
    }

    private static void tutorial() {
        // int has a width of 12
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMaxValue/2);
        System.out.println(myTotal);


        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println(myNewByteValue);


        // short has a width of 16
        short myShortValue = -32_768;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println(myNewByteValue);


        // long has a width of 64
        long myLongValue = -9_223_372_036_854_775_80L;
    }
}
