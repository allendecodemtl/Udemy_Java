package com.company.e_06;

public class OpPrecedence {

    public static void main(String[] args) {
        int topScore = 100;
        int secondTopScore = 95;

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println(topScore);
            System.out.println(secondTopScore);
            System.out.println("One of them is true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }


        boolean isChar = false;
        // Assigning boolean to boolean and returns boolean there possible
        if(isChar = true){
            System.out.println("This is not supposed to happen");
        }


        // Turnary operator
        boolean wasCar = isChar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }


        // Tutorial
        double var1 = 20d;
        double var2 = 80d;

        double totalVar = (var1 + var2) * 25;
        System.out.println(totalVar);
        double remainder = totalVar % 40;
        System.out.println(remainder);

        if (remainder <= 20d) {
            System.out.println("Total was over the limit");
        }


    }
}
