package Exercise;

public class E12GreatestCommonDivisor {

    public static void main(String[] args) {
        int res;
        res = getGreatestCommonDivisor(25, 15);
        //should return 5 since both can be divided by 5 without a remainder
        System.out.println(res);

        res = getGreatestCommonDivisor(12, 30);
        //should return 6 since both can be divided by 6 without a remainder
        System.out.println(res);

        res = getGreatestCommonDivisor(9, 18);
        //should return -1 since the first parameter is < 10
        System.out.println(res);

        res = getGreatestCommonDivisor(81, 153);
        //should return 9 since both can be divided by 9 without a remainder
        System.out.println(res);

    }

    public static int getGreatestCommonDivisor (int first, int second){

        if (first <10 || second < 10){
            return -1;
        }


        int greatestCommonDemo = 1;

        for(int i=1; i<=second; i++){
            if (second % i == 0){

                int firstProcess = 1;
                while (firstProcess < first){

                    if (first % firstProcess == 0 && second % firstProcess == 0){
                        greatestCommonDemo = firstProcess;
                    }

                    firstProcess++;
                }
            }
        }

        return greatestCommonDemo;
    }
}