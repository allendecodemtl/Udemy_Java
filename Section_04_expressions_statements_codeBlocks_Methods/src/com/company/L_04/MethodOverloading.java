package com.company.L_04;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);

        calculateScore(75);
        calculateScore();

        // 1 inch = 2.54 cm
        // 1 foot = 12 inches
        double res;

        res = calcFeetAndInchesToCentimeters(6,5);
        System.out.println(res);
        res = calcFeetAndInchesToCentimeters(100);
        System.out.println(res);
    }

    private static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName);
        return score * 1000;

    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }


    // Challenge
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        double value = -1;

        boolean p1 = (feet >= 0);
        boolean p2 = ((inches >= 0) && (inches <= 12));

        if (p1 && p2) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += (inches * 2.54);
            return centimeters;
        }

        return value;

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        double value = -1;

        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remianingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remianingInches);
        }

        return value;

    }


}
