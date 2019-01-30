package L_03;

public class ForStatement {
    public static void main(String[] args) {
        for (int i=2; i<9; i++) {
            System.out.println("Interest: " + i + " Amount: " + String.format("%.2f",calculateInterestRate(10_000d, i)));
        }

        for (int i=8; i>1; i--) {
            System.out.println("Interest: " + i + " Amount: " + String.format("%.2f",calculateInterestRate(10_000d, i)));
        }

        int count = 0;

        for (int i=10; i<50 ; i++) {
            if(isPrime(i)){
                count++;
                System.out.println(i);
                if (count == 10) break;
            }

        }

    }



    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        // Optimise version 1
        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }

        // Optimise version 2
        //for (int i=2; i <= n/2; i++) {
        //    if (n % i == 0) {
        //        return false;
        //    }
        //}

        return true;
    }

    public static double calculateInterestRate (double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
