package Exercise;

public class E17LargestPrime {
    public static void main(String[] args) {
        int res;
        res = getLargestPrime (21); // should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(res);

        res = getLargestPrime (217); // should return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(res);

        res = getLargestPrime (0); // should return -1 since 0 does not have any prime numbers
        System.out.println(res);

        res = getLargestPrime (45); // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(res);

        res = getLargestPrime (-1); // should return -1 since the parameter is negative
        System.out.println(res);

        res = getLargestPrime (7); // should return -1 since the parameter is negative
        System.out.println(res);
    }


    public static int getLargestPrime (int number){

        int counter = 2;
        int maxPrime = -1;

        // Loop through numbers
        while (counter <= number){

            if (number % counter == 0){

                boolean isPrime = true;
                for (int i= 2; i < counter; i++) {
                    if (counter % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime){
                    maxPrime = counter;
                }
            }

            counter++;
        }
        return maxPrime;
    }
}
