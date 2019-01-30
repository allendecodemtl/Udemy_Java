package com.company.L_04;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);

        calculateScore(75);
        calculateScore();
    }

    private static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    private static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName);
        return score * 1000;

    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }


}
