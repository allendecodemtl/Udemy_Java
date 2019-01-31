package Exercise;

public class E16FlourPack {
    public static void main(String[] args) {
        boolean res;
        res = canPack (1, 0, 4);
        //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        System.out.println(res);

        res = canPack (1, 0, 5);
        //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        System.out.println(res);

        res = canPack (0, 5, 4);
        //should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos.
        System.out.println(res);

        res = canPack (2, 2, 12);
        //should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 12 kilos.
        System.out.println(res);

        res = canPack (-3, 2, 12);
        //should return false since bigCount is negative.
        System.out.println(res);

        res = canPack (2, 1, 5);
        //should return true
        System.out.println(res);

        res = canPack (0, 5, 6);
        //should return false
        System.out.println(res);

        res = canPack (2, 7, 18);
        //should return false
        System.out.println(res);


    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }


        // (1, 0, 4) //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        // (1, 0, 5) //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        // (0, 5, 4) //should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos.
        // (2, 2, 12) //should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 12 kilos.
        // (-3, 2, 12) //should return false since bigCount is negative.
        // (2, 1, 5) //should return true
        // (0, 5, 6) //should return false
        // (2, 7, 18); // false


        // Loop bigCount for (goal - 5)
        int pGoal = goal;
        int pBigCount = 0;
        while (pGoal >= 5 && bigCount > 0 && pBigCount < bigCount) {
            pGoal -= 5;
            pBigCount++;
        }

        System.out.println(pGoal);

        if (smallCount >= pGoal) {
            return true;
        }

        return false;

    }
}
