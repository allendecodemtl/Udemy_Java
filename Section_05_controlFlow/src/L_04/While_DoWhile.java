package L_04;

public class While_DoWhile {
    public static void main(String[] args) {
        int count = 0;

        while(count<5){
            System.out.println(count);
            count++;
        }

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println(count);
            count++;
        }

        count = 6;
        do{
            System.out.println(count);
            count++;

            if (count > 100){
                break;
            }
        } while(count != 6);



        // Challenge
        int number = 4;
        int finishedNumber = 20;

        while (number <= finishedNumber){
            number++;
            if (!isEvenNumber(number)){
                // Allow loop to continue
                continue;
            }
            System.out.println("Even: " + number);
        }


        // Challenge two
        number = 4;
        finishedNumber = 20;
        int sumEven = 0;
        int countEven = 0;

        while (number <= finishedNumber){

            number++;

            if (!isEvenNumber(number)) continue;

            System.out.println("Even num: " + number);

            sumEven += number;
            countEven++;

            if (countEven >= 5){
                break;
            }

        }

        System.out.println("Sum even num: " + sumEven);

        for (int i=0; i<10; i++){
            if (i>=5 && i<=7){
                continue;
            }
            System.out.println(i);
        }

    }

    public static boolean isEvenNumber (int p1){
        if (p1 % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
