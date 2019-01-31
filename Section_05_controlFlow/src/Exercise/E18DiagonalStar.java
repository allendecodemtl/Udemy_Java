package Exercise;

public class E18DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar (int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {

            int numRow = number;

            for (int i = 1; i <= numRow; i++) {
                for (int j = 1; j <= numRow; j++) {
                    if (i == 1 || i == numRow) { // Print rows
                        System.out.print("*");
                    } else if (j == 1 || j == numRow) { // Print columns
                        System.out.print("*");
                    } else if (i == j) { // Row number equals column number
                        System.out.print("*");
                    } else if (j == (numRow - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
