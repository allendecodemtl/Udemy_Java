package com.company.L_03;

public class IfKeywordsAndCodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) System.out.println("Your score is 5000");

        // Same as above
        if (score == 5000)
            System.out.println("Your score is 5000");

        // Same as above
        if (score == 5000) {
            System.out.println("Your score is 5000");
        }

        System.out.println("After code block");



        if (score == 5000 && score > 1000) {
            // can access var ourside of codeblock
            int finalScore = score + 1;
            System.out.println("Your score is 5000");
        } else if (score > 5000){
            System.out.println("Got Here");
        } else {
            System.out.println("Else");
        }

        // Not possible to access var inside of code block
        //System.out.println(finalScore);




    }
}
