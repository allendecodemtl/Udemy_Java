package Exercise;

public class E11LastDigitChecker {

    public static void main(String[] args) {
        boolean res;
        res = hasSameLastDigit (41, 22, 71);
        //should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(res);

        res = hasSameLastDigit (23, 32, 42);
        //should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(res);

        res = hasSameLastDigit (9, 99, 999);
        //should return false since 9 is not within the range of 10-1000
        System.out.println(res);


    }

    public static boolean hasSameLastDigit(int p1, int p2, int p3){

        boolean p1Check = (p1 < 10 || p1 > 1000);
        boolean p2Check = (p2 < 10 || p2 > 1000);
        boolean p3Check = (p3 < 10 || p3 > 1000);

        if (p1Check || p2Check || p3Check){
            return false;
        }

        int p1LastDigit = p1 % 10;
        int p2LastDigit = p2 % 10;
        int p3LastDigit = p3 % 10;

        if (p1LastDigit == p2LastDigit  || p1LastDigit == p3LastDigit || p2LastDigit == p3LastDigit) {
            return true;
        }

        return false;

    }
}
