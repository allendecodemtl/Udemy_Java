package L_04_JavaUtilPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        //action1(employees);
        //action2(employees);
        //action3(employees);

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge() <= 30);
        printEmployeesByAge(employees, "Employees 30 and under", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a+5));
        System.out.println(greaterThan15.and(lessThan100).test(50));
        System.out.println(greaterThan15.and(lessThan100).test(15));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(10000);
        for(int i=0; i<10; i++){
            System.out.println(randomSupplier.get());
        }

        employees.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ')+1);
            System.out.println(employee.getName());
            System.out.println("Last Name is: " + lastName);
        });


    }

    public static void action1(List<Employee> employees){
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
    }

    public static void action2(List<Employee> employees){
        System.out.println("Employees over 30.");
        System.out.println("==================");
        for (Employee employee : employees){
            if (employee.getAge() > 30){
                System.out.println(employee.getName());
            }
        }
    }

    public static void action3(List<Employee> employees){
        System.out.println("Employees over 30.");
        System.out.println("==================");
        employees.forEach(employee -> {
            if (employee.getAge() > 30){
                System.out.println(employee.getName());
            }
        });
        System.out.println();
        System.out.println("Employees 30 and younger");
        System.out.println("==================");
        employees.forEach(employee -> {
            if (employee.getAge() <= 30){
                System.out.println(employee.getName());
            }
        });
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("==================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}