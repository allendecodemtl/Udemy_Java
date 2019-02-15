package L_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

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

        System.out.println(everySecondCharacter(everySecondChar,myString));

        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);


        System.out.println("======================");
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        // Other
        List<String> firstUpperCaseList = new ArrayList<>();
        topNames2015.forEach((name) -> {
            firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1));
        });
        firstUpperCaseList.sort((String::compareTo));
        firstUpperCaseList.forEach(System.out::println);

        // Lambda
        topNames2015.stream()
                .map(s -> s.substring(0,1).toUpperCase().concat(s.substring(1)))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println(
                topNames2015.stream()
                .filter(s -> s.substring(0,1).toUpperCase().equals("A"))
                .count());




    }

    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }
}
