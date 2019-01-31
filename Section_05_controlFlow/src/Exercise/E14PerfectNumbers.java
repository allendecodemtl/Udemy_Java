package Exercise;

public class E14PerfectNumbers {
    public static void main(String[] args) {
        boolean res;

        res = isPerfectNumber(6);
        //should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(res);

        res = isPerfectNumber(28);
        //should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(res);

        res = isPerfectNumber(5);
        //should return false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(res);

        res = isPerfectNumber(-1);
        //should return false since the number is < 1
        System.out.println(res);

    }

    public static boolean isPerfectNumber (int number){

        if(number < 1){
            return false;
        }

        int counter = 1;
        int sumPerfectNum = 0;
        while (counter < number){

            if (number % counter == 0){
                sumPerfectNum += counter;
            }

            counter++;
        }

        return (sumPerfectNum == number) ?  true : false;
    }


}
