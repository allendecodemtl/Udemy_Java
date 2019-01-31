package Exercise;

public class E15NumberOfWords {
    public static void main(String[] args) {

        int res;
//        res = getDigitCount(0); //should return 1 since there is only 1 digit.
//        System.out.println(res);
//        res = getDigitCount(123); //should return 3.
//        System.out.println(res);
//        res = getDigitCount(-12); //should return -1 since the parameter is negative.
//        System.out.println(res);
//        res = getDigitCount(5200); //should return 4 since there are 4 digits in the number.
//        System.out.println(res);
//
//
//        res = reverse(-121); //should  return -121.
//        System.out.println(res);
//        res = reverse(1212); //should return  2121.
//        System.out.println(res);
//        res = reverse(1234); //should return 4321.
//        System.out.println(res);
//        res = reverse(100); //should return 1.
//        System.out.println(res);
//
//
//        numberToWords(123); ////should print "One Two Three".
//        numberToWords(1010); ////should print "One Zero One Zero".
//        numberToWords(1000); ////should print "One Zero Zero Zero".
//        numberToWords(-12); ////should print "Invalid Value" since the parameter is negative.

        numberToWords(1000); ////should print "One Zero Zero Zero".
        numberToWords(101); ////should print "One Zero Zero Zero".

    }

    public static void numberToWords(int number){
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int processNum = reverse(number);
        int digitCountOriginal = getDigitCount(number);
        int digitCountReverse = getDigitCount(processNum);

        while(processNum != 0){
            int lastDigit = processNum % 10;

            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            processNum /= 10;
        }

        while (digitCountReverse < digitCountOriginal){
            System.out.println("Zero");
            digitCountReverse++;
        }
    }

    public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }

        if (number == 0){
            return 1;
        }

        int processNum = number;
        int count = 0;

        while (processNum != 0){
            processNum /= 10;
            count++;
        }

        return count;

    }

    public static int reverse(int number){
        int processNum = number;
        int reverseNum = 0;

        while(processNum != 0){
            int lastDigit = processNum % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            processNum /= 10;
        }

        return reverseNum;
    }
}
