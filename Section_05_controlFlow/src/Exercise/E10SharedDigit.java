package Exercise;

public class E10SharedDigit {
    public static void main(String[] args) {
        boolean res;
        res = hasSharedDigit(12, 23);
        //should return true since the digit 2 appears in both numbers
        System.out.println(res);

        res = hasSharedDigit(9, 99);
        //should return false since 9 is not within the range of 10-99
        System.out.println(res);

        res = hasSharedDigit(15, 55);
        //should return true since the digit 5 appears in both numbers
        System.out.println(res);
    }

    public static boolean hasSharedDigit(int p1, int p2) {

        boolean boolP1 = ((p1 < 10) || (p1 > 99));
        boolean boolP2 = ((p2 < 10) || (p2 > 99));

        if (boolP1 || boolP2){
            return false;
        }

        int processP1 = p1;

        while (processP1 != 0) {
            int p1LastDigit = processP1 % 10;

            int procesP2 = p2;

            while (procesP2 != 0) {
                int p2LastDigit = procesP2 % 10;

                if (p2LastDigit == p1LastDigit){
                    return true;
                }

                procesP2 /= 10;
            }

            processP1 /= 10;
        }

        return false;
    }
}
