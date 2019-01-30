package Exercise;

public class E08EvenDigitSum {
    public static void main(String[] args) {
        int res;
        res = getEvenDigitSum(123456789);
        //should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(res);

        res = getEvenDigitSum(252);
        //should return 4 since 2 + 2 = 4
        System.out.println(res);

        res = getEvenDigitSum(-22);
        //should return -1 since the number is negative
        System.out.println(res);
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int process = number;
        int sum = 0;

        while (process != 0) {
            int lastDigit = process % 10;

            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }

            process /= 10;
        }
        return sum;
    }
}
