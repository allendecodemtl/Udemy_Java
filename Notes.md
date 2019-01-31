## **Method Overloading**
> Overloading only applies to parameters
``` java
public static int sum(int a, int b) {
  retrun a + b;
}

public static int sum(int a, int b, int c) {
  retrun a + b + c;
}

public static int sum(int a, int b, int c, int d) {
  retrun a + b + c + d;
}
```

>- Return type does not differentitate methods
>- Here compiled error due to same method signature
``` java 
private static int calculateScore() {
    System.out.println("No player name, no player score");
    return 0;
}

private static void calculateScore() {
    System.out.println("No player name, no player score");
}
```

## **CONSTANT Value**
> By convention final variable is in all caps
``` java
private static final String INVALID_VALUE_MESSAGE = "Invalid value";
```

## **Switch Statement**
> Since Java 7, we have swtich statement with String
``` java
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
```


## **Minutes to Years and Days Function**
``` java
public static void printYearsAndDays (long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {

            long minInOneYear = (365 * 24 * 60);
            long minInOneDay = (24 * 60);
            long years = minutes / minInOneYear;
            long days = minutes / minInOneDay;
            long remaingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remaingDays + " d");
        }
    }
```

## **Leap Year Function**
``` java
public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

}
```


## **Prime Numbers Function**
``` java
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
```

## **Sum digits function**
``` java
public static int sumDigits (int number){

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while(number > 0){
            // extract least significant digit
            int digit = number % 10;
            sum += digit;

            // drop least significant digit
            number /= 10;

        }

        return sum;

}
```

## **Palindrome function**
``` java
public static boolean isPalindrome(int number){

        int processed = number;
        int reversed = 0;


        while (processed != 0){

            // get least significant number
            int lastDigit = processed % 10;
            reversed = (reversed * 10) + lastDigit;

            processed /= 10;

        }

        if (number == reversed){
            return true;
        } else {
            return false;
        }

}
```

## **Sum first and last digit function**
``` java
public static int sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }

        int last = number % 10;

        int first = number;
        while (first >= 10) {
            first /= 10;
        }

        return first + last;

}
```


## **Break vs Continue in loop**
> Break will exit the loop depending on the condition that we are checking
> Continue will bypass the part of code block that is below the continue keyword and continue with the next iteration
``` java
int number = 4;
int finishedNumber = 20;
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
```

## **Things to review**
>- Encapsulation

## **this vs super**
>- **super** is used to access/call the parent class members (var and methods)
>- **this** is used call the current class members (var and methods)
>- **Note** can use both of them anywhere in a class **except** static areas (static block or a static method). Any attempt to do so will lead to compile_time_error.

## **this() vs super()**
>- Use **this()** to call a constructor from another overloaded constructor in the same class
>- The call to **this()** can be used only in a constructor and must be the first statement in the constructor. It's used with constructor chaining (when one constructor calls another constructor) and helps to reduce duplciated code
>- Only way to call a parent constructor is by calling **super()**
>- Java compiler puts a default call to **super()** if we don't add it, and it is always the no-args **super** which is inserted by compiler (constructor without arguments)
>- Even **abstract classes** hav constructors, although can never instantiate using the new keyword
>- An **super()** is still a **super** class, so its constructors run when someone makes an instance of a concrete subclass
>- **NOTE:** A constructor can have a call to **super()** OR **this()** but never both

## **Good Constructor Example**
> 3rd constructor doing all the work
> Example of constructor chaining
``` java
public Rectangle(){
    this(0,0);
}
public Rectangle(int w, int h){
    this(0,0,w,h);
}
public Rectangle(x,y,w,h){
    this.x = x;
    this.y = xy;
    this.w = w;
    this.z = z;
}
```

## **Constructor**
> TODO - think generate empty constructor when not exist
``` java
public Account(){
    // Calling another constructor - it needs to be the very first line; otherwise won't work
    this("543ss1", 2.5, "Default name", "Default address", "Default phone");
    System.out.println("Empty constructor called");
}

public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
    System.out.println("Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmailAddress = customerEmailAddress;
    this.customerPhoneNumber = customerPhoneNumber;
}
```
> Account bob = new Account(); -> will give below, because empty constructor will call other constructor first before printing "Empty.."
```
Account constructor with parameters called
Empty constructor called
```
> Don't called setters in constructor
``` java
public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
    System.out.println("Account constructor with parameters called");
    this.number = number; -> good
    setBalance(balance); -> not good; don't do this
    ...
}
```

## **Inheritance**
> Calling super and overiding methods
``` java
public class Animal {
    // Declare Variables here

    // Appropriate constructor here 

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called; Animal is moving at " + speed);
    }

    // Getters and setters below
}


public class Dog extends Animal {

    // Declare Variables here

    // Appropriate constructor here 

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.chew() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); // -> Force calling parent method
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10); // -> Find overiding method ? use local method : use parent method 
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        moveLegs(speed); 
        super.move(speed); // -> Force calling parent method
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() is called");
    }
}
```
``` java
Animal animal = new Animal("Animal",1,1,5,5);
Dog dog = new Dog("Yorkie",8,20,2,4,1,20, "Long silky");

dog.eat();
dog.walk();
dog.run();

// Prints below
Dog.chew() called 
Dog.chew() called 
Animal.eat() called

Dog.walk() called
Animal.move() called; Animal is moving at 5

Dog.run() called
Dog.move() is called
Dog.moveLegs() is called
Animal.move() called; Animal is moving at 10
```


## **Reference vs Object vs Instance vs Class**
> Analogy of building a house
>- A **class** is a blueprint(plans) for a house, we build many houses as per the plans.
>- Each (new) house you build (instantiate) is an object aka **instance**
>- Each (new) house has an address (physical location). This is known as **reference**
>- You can copy that **reference** as many times as you like but there is sill one house.  You are copying the paper that has address on it not the house itself
>- We can pass **reference** as **parameters** to **constructors** and **methods**
``` java

class House {
    private String color;
    // Constructor House(color)
    // Getter and setters;
}

House blueHouse = new House("blue");
House anotherHouse = blueHouse;

System.out.println(blueHouse.getColor()); // -> blue
System.out.println(anotherHouse.getColor()); // -> blue

anotherHouse.setColor("red");
System.out.println(blueHouse.getColor()); // -> red
System.out.println(anotherHouse.getColor()); // -> red

House greenHouse = new House("green");
anotherHouse = greenHouse;
System.out.println(blueHouse.getColor()); // -> red
System.out.println(greenHouse.getColor()); // -> green
System.out.println(anotherHouse.getColor()); // -> green

```

## **Classes**
> 
``` java
```

