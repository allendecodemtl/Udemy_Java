package Exercise;

public class E08FirstLastDigit {
    public static void main(String[] args) {
        int res;

        res = sumFirstAndLastDigit(252);
        // should return 4, first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        System.out.println(res);

        res = sumFirstAndLastDigit(257);
        // should return 9, first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        System.out.println(res);

        res = sumFirstAndLastDigit(0);
        // should return 0, first digit and the last digit is 0, since we only have 1 digit, which gives us 0+0 and the sum is 0.
        System.out.println(res);

        res = sumFirstAndLastDigit(5);
        // should return 10, first digit and last digit is 5, since we only have 1 digit, which gives us 5+5 and the sum is 10.
        System.out.println(res);

        res = sumFirstAndLastDigit(-10);
        // should return -1, because the parameter is negative and needs to be positive.
        System.out.println(res);

    }

    public static int sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }

        int last = number % 10;

        int first = number;
        while (first >= 10) {
            first /= 10;
        }

        return first + last;

    }
}
