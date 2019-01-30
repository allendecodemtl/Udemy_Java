package L_01;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 1");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break; // Not necessary
        }

        // Challenge
        char var = 'E';

        switch (var){
            case 'A':
                System.out.println(var);
                break;
            case 'B':
                System.out.println(var);
                break;
            case 'C': case 'D': case 'E':
                System.out.println(var);
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";

        switch (month) {
            case "January":
                System.out.println(month);
                break;
            case "June": case "July":
                System.out.println(month);
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }
}
