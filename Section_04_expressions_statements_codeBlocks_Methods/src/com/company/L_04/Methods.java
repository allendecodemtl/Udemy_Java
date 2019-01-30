package com.company.L_04;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(gameOver, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        // Challenge
        highScore = calculateScorePosition(1500);
        displayHighScorePosition("Max", highScore);

        highScore = calculateScorePosition(900);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateScorePosition(400);
        displayHighScorePosition("Giles", highScore);

        highScore = calculateScorePosition(50);
        displayHighScorePosition("Loise", highScore);

    }

    private static int calculateScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;  // assuming position is 4

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;

    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = -1;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;

    }

}
