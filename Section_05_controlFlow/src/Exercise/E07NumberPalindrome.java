package Exercise;

public class E07NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        //return true

        System.out.println(isPalindrome(707));
        //return true

        System.out.println(isPalindrome(11212));
        //return false because reverse is 21211 and that is not equal to 11212.

    }

    public static boolean isPalindrome(int number){

        int processed = number;
        int reversed = 0;


        while (processed != 0){

            // get least significant number
            int lastDigit = processed % 10;
            reversed = (reversed * 10) + lastDigit;

            processed /= 10;

        }

        if (number == reversed){
            return true;
        } else {
            return false;
        }

    }
}
