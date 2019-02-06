package L_03_NestedBlock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}

class AnotherClass{
    public String doSomething1(){
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expressions's class is: " + getClass().getSimpleName());  // -> Returns "AnotherClass"
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());      // -> Returns "AnotherClass"
        return Main.doStringStuff(uc,"String1", "String2");
    }

    public String doSomething2(){
        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());        // -> Returns "AnotherClass"
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());     // -> Returns ""
                return s1.toUpperCase() +  s2.toUpperCase();
            }
        }, "String1","String2");
    }

    public String doSomething3(){
        final int i = 0;  // Must be set to final if passed to anonymous class
        {
            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("i [within anonymous class] = " + i);
                    return s1.toUpperCase() + s2.toUpperCase();
                }
            };

            System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());

            //i++;   -> Cannot be mutated because it is final
            System.out.println("i = " + i);
            return Main.doStringStuff(uc,"String1", "String2");
        }
    }

    public String doSomething4(){
        int i = 0;
        //i++;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expressions's class is: " + getClass().getSimpleName());
            System.out.println("i in lambda expression = " + i);  // -> i needs to be declared final or never change -> will have compile error e.g if we add i++
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        // s1 = "Hello" -> Scope - only accessible in the block

        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc,"String1", "String2");
    }

    public void printValue(){
        int number = 25;

        Runnable r = () -> {
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.printf("The value is " + (number - 10));  // Can be changed inside the lambda expression but cannot outside by default it's final outside
        };

        new Thread(r).start();
    }
}
