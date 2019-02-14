package L_Challenge;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            Arrays.stream(parts).forEach(System.out::println);
        };

        new Thread(runnable).start();

        Function<String, String> everySecondChar = (String source) -> {
            return source + "-";
        };

        String myString = "Let's split this up into an array";
        System.out.println(everySecondChar.apply(myString));

    }

    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }
}
