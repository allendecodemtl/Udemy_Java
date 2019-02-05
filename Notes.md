## **Static Methods**
>- **Static methods** are declared using a static modifier
>- **Static methods can't** access instance methods and instance variables directly
>- They are usually used for operations that don't require any data from an instance of the class (from 'this')
>- **Static methods can't** use the **this** keyword
>- Whenever you see method that does not use instance variables that method should be declared as a static method
>- Example - main is a static method and it is called by the JVM when it starts an app

## **Instance Methods**
>- **Instance methods** below to an instance of a class
>- To use an **instance method** we have to instantiate the class first usually by using the new keyword
>- **Instance methods** can access instance methods and variance variables directly
>- **Instance methods** can also access static methods and static var directly

``` java 
cclass Calculator{
    public static void printSum(int a, int b){
        System.out.println("sum= " + (a + b));
    }
    public void printMultiply(int a, int b){
        System.out.println("multiply= " + (a * b));
    }
}

public class Main {
    public static void main(String[] args) {

        // Static methods
        Calculator.printSum(5 ,10); // -> called as ClasName.methodName();
        printHello();               // -> called as methodName(); only if in the same class

        // Instance method
        Calculator cal = new Calculator(); // -> create instance
        cal.printMultiply(3,5);            // -> call instance methods
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
```
___
## **Static Variables**
>- Declared by using the keyword static
>- Static var aka static member var
>- Every instance of that class shares the same instance var
>- If changes are made all instance will see the effect of change
>- Not used very often but can sometimes be very useful
``` java
class Dog{
    private static String name;
    public Dog(String name) { Dog.name = name; }  // Set static var
    public void printName() { System.out.println("name = " + name); }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName();       // -> prints "fluffy"
        fluffy.printName();    // -> prints "fluffy"
    }
}
```

## **Instance Variables**
>- Don't use the keyword static
>- aka files or member fields
>- Instance vars belong to an instance of a class
>- Every instance has it's own copy of an instance var
>- Every instance can have a different value (state)
>- Instance vars represent the state of an instance
``` java
class Dog{
    private static String name;
    public Dog(String name) { this.name = name; } // Instanciate instance var
    public void printName() { System.out.println("name = " + name); }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName();       // -> prints "rex"
        fluffy.printName();    // -> prints "fluffy"
    }
}
```
___

## **Method Overloading**
>- **Overloading** does not have anything to do with **polymorphism** but java developers oftern refer to overloading as Compile Time Polymorphism
>- In other words the compiler decided which methods is going to be called based on the method name, return type and arguement list.
>- We **can overlaod static** and **instance** methods
>- Usually **Overloading** happends inside a single class, but a method can also be treated as **overloade** usn the subclass of that class
>- That is because a **subclass inherits** one version of the method from the parent class and then the subclass can have another overloaded version of the method
>- Methods will be considered overloaded if both follow the following rules:
>   * Methods must have the same method name
>   * Methods must have different parameters
>- If methods follow the above rules, then they may or may not
>   * Have different return types
>   * Have different access modifiers
>   * Throw different checked and unchecked exception

## **Method Overriding**
>- Method **overriding** means defining a method in a child class that already exists in the parent class with same signature (method name and parameters)
>- Method **overriding** aka as **Runtime Polymorphysim** and **Dynamic Method Dispatch**, becasue the method that is going to be called is decided at runtime by the JVM
>- Methods will be considered **overridden** if we follow these rules:
>   * It must have same name and same arguments
>   * Return type can be a subclass of the return type in the parent class
>   * It can't have a lower access modifier
>   * Example - parent method is protected, then using private in the child is not allowed but using public in the child would be allowed
``` java
class Animal {
    protected void walk(){};
}
class Fist {
    @override
    ~~private~~ public void walk(){}; // -> private won't be allowed but public
}
```
>- Important points 
>   * Only inherited methods can be overriden
>   * Constructors and private methods cannot be overriden
>   * Methods that are final cannot be overriden
>   * A subclass can user super.methodName() to call the superclass version of an overriden method

![Recap](images/img_0001.png)

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
___
## **Is a vs Has**
> Inheritance (IS A)
``` java
public class Car extends Vehicle { // -> Car "IS A" vehicle
    ....    
}
```
> Composition (HAS A)
>   * Object within objects
``` java
public class Main{
    public static void main(String[] args) {
        Case myCase = new Case(... Initiliase with correct args);
        Resolution myResolution = new Resolution(... Initiliase with correct args);
        Monitor myMonitor = new Monitor(...., myResolution ,.....)
        
        PC myPC = new PC(myCase, myMonitor); // Initialising with appropriate object
        myPC.getMonitor().draw(100,200,"red"); // Accessing methods of monitor object
        myPC.getTheCase().pressProwerButton(); // Accessing methods of case object
    }
}

public class PC {
    private Case theCase;       // Composition -> PC "HAS A" Case
    private Monitor theMonitor; // Composition -> PC "HAS A" Monitor

    // Constructor
    // Getter and Setters
}

public class Case {
    // Class vars
    // Constructor
    public void pressProwerButton() {
        System.out.println("Power button pressed");
    }
    // Getters and setters
}

public class Monitor {
    // Decalre other class var
    private int size; // Example Class variables 
    private Resolution nativeResolution;  // This is composition => Monitor "HAS A" resolution

    // Constructor
    public static draw(int x, int y, String color) {
        System.out.println("Drawing prixel at " + x + "," + y + " in color " + color);
    }
    // Getters and setters
}

public class Resolution {... usual stuffs ...}
```
___

## **Encapsulation**
> 

___

## **Polymorphism**
> If inherits from a class, JVM will determine which method to use.. Usually the local method but if not available, it will go to the parent.
``` java
public class Movie { .. plot = (): void -> print "No Plot" ..}
public class Jaws extends Movie{} { .. plot = (): void -> print "Jaws" ..}
public class MazeRunner extends Movie{} { .. plot = (): void -> print "MazeRunner" ..}
public class StarWars extends Movie{} { .. plot = (): void -> print "StarWars" ..}
public class Forgetable extends Movie{} { .. No plot method present ..}
public class Main { 
    psvm = (String[] agrs) -> {
        Movie movie = randomMovie();
        sout(movie.plot()); 
        -> if Forgetable obj was returned -> sout will print "No Plot"
        -> else other obj was returned -> sout will print corresponding class method output
    }
    randomMovie = () -> { 
        Depending on random number generate and 
        return (new Jaws() || new MazeRunner() || new StarWars() || new Forgetable())
    }
}

```

___

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

## **Reverse array logic function**
``` java 
public static int[] reverseMine(int[] array){
    int[] reverseArray = new int[array.length];
    for(int i = 0; i< array.length; i++){
        reverseArray[i] = array[array.length-1-i];
    }
    return reverseArray;
}

private static void reverse(int[] array){
    int maxIndex = array.length-1;
    int halfLength = array.length/2;

    for (int i=0; i<halfLength; i++){
        int temp = array[i];
        array[i] = array[maxIndex - i];
        array[maxIndex-i] = temp;
    }
    }
```


## **Sorting & copying arrays using basic loop function**
``` java
public static int[] sortIntegers(int[] array){
    int[] sortedArray = new int[array.length];
    // Copyng an array to another array
    for(int i=0; i<array.length; i++){
        sortedArray[i] = array[i];
    }
    // Alternative would be to use copyOf
    // int[] sortedArray = Arrays.copyOf(array, array.length);

    // Sorting algorithm using basic loop 
    boolean flag = true;
    int temp;

    while(flag){
        flag = false;
        for(int i=0; i<sortedArray.length-1; i++){
            if (sortedArray[i] < sortedArray[i+1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+2] = temp;
                flag = true;
            }
        }

    }
    return sortedArray;
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


## **Break vs Continue vs Return**
>-  The break statement results in the termination of the loop, it will come out of the loop and stops further iterations. 
>-  The continue statement stops the current execution of the iteration and proceeds to the next iteration. 
>-  The return statement takes you out of the method.

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

## **Arrays**
> Needs to be the same type
> Method 1 - Declaring arrays and accessing elements
``` java
int[] myIntVariable = new int[10];
myIntVariable[0] = 50;                  // -> Starting index = 0
System.out.println(myIntVariable[0]);   // -> Print 50
```
> Method 2 - Declaring arrays
``` java
int[] myIntVariable = {1,2,3,4,5,6};     // Declare and initialise
System.out.println(myIntVariable[5]);    // Print 6
```

## **Refrence Types vs Value Types**
> (Array and Object) vs Primitives
> Array are reference types (hold an address not the object itself)
> Also applies when passed as method parameter
``` java
....{
int[] myIntArray = new int[5];  // -> Here myIntArray hold a reference to the object int[5] which is stored somewhere else in mem
int[] anotherArray = myIntArray; // -> Here anotherArray hold the referenc to the object int[5]
System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // -> [0, 0, 0, 0, 0]
System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // -> [0, 0, 0, 0, 0]
anotherArray[0] = 1;
System.out.println("after change myIntArray = " + Arrays.toString(myIntArray)); // -> [1, 0, 0, 0, 0]
System.out.println("after change anotherArray = " + Arrays.toString(anotherArray)); // -> [1, 0, 0, 0, 0]
modifyArray(myIntArray);
System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));    // -> [2, 0, 0, 0, 0] 
System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray)); // -> [2, 0, 0, 0, 0]
}...
private static void modifyArray(int[] array){
    array[0] = 2;
    array = new int[] {1,2,3,4,5}; // dereferincing
}
```

## **List and Arraylist**


## **Copying Arraylist**
``` java
private static void processArrayList() {
    ArrayList<String> newArray = new ArrayList<String>();
    newArray.addAll(groceryList.getGroceryList());

    ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

    String[] myArray = new String[groceryList.getGroceryList().size()];
    myArray = groceryList.getGroceryList().toArray(myArray);
}
```

## **Autoboxing vs unboxing**
//TODO -> not required since Java5 -> JVM automatically do it
> ArrayList
``` java
ArrayList<String> stringArrayList = new ArrayList<>();
stringArrayList.add("Tim");
```
> ArrayList cannot be of primitive type
``` java
// Bellow not allowed
// ArrayList<int> intArrayList = new ArrayList<int>();
```
> One workaround is to create a class to store int
``` java
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

psvm = (String[] args){
    ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
    intClassArrayList.add(new IntClass(54));
}
```
> **Long verison -** Better workaround is to use autoboxing and unboxing in java
``` java
Integer integer = new Integer(54);
Double doubleValue = new Double(43d);

ArrayList<Integer> intArrayList = new ArrayList<Integer>();
for(int i=0; i<=10; i++){
    intArrayList.add(Integer.valueOf(i));  // This is autoboxing -> converting primitives to Integer obj/wrapper
}

for(int i=0; i<intArrayList.size(); i++){
    System.out.println(i + " -> " + intArrayList.get(i).intValue());  // This is unboing -> coverting Integer obj/wrapper to primitives
}
```
> **Short verison -** Better workaround is to use autoboxing and unboxing in java
``` java
Integer myIntValue = 56;  // JVM will do - Integer.valueOf(56);
int myInt = myIntValue;   // JVM will do - myInt.intValue();
```


## **List <<inteface>>**
> ArrayList class implements List interface and it is based on an Array data structure

> LinkedList is a doubly-linked list implementation of the List and Deque interfaces
```
An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, and obtain the iterator's current position in the list. A ListIterator has no current element; its cursor position always lies between the element that would be returned by a call to previous() and the element that would be returned by a call to next(). An iterator for a list of length n has n+1 possible cursor positions, as illustrated by the carets (^) below:
                      Element(0)   Element(1)   Element(2)   ... Element(n-1)
 cursor positions:  ^            ^            ^            ^                  ^
```
>- A doubly-linked chain: elements are stored in nodes, with linking back and forth between themselves,
>- Mutable: objects can be added and/or removed,
>- Not Thread-safe: LinkedList is not suitable for concurrent access.


## **Inteface**
> Interface is just the declaration of methods of a Clas, it's not the implementation
> In an interface, we define what kind of operation an object can perform.  These operations are defined by the classes that implement the interface
> Interfaces form a contract between the class and the otuside world, and this contract is enforced at build time by the compiler
> You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation.  All methods in the interfaces are automatically public and abstract
> By introducing interaces into your program, you are really introducing points of variation at which you can plug in different implementations for that interface.  An interfaces primary purposes is abstraction, decoupling the "what" from the "how"
> **NOTE** 
>- Since Java 8 interfaces can contain default methods.  In other words methods with implementation.  The keyword default is used (mostly for backwards compatibility), and static methods as well before Java 8 that was not possible.
>- Since Java 9 interfaces can also contain private methods (commonly used when two default methods in an Interface share commo n code
``` java
public interface Test {
    void doSomething();
    default void defaultMethod(){
        System.out.printf("default method allow since Java 8");
    };

    private void shareByDefaultMethod(){
        System.out.printf("Java 9 - private method allowed, usually used for common methods of default methods");
    }
}
```
> **When to use an Interface** 
>- You expect that unrelated calsses will implement your interface. E.g the interfaces Comparable and Cloneable are implemented by many unrelated classes.
>- You want to specify the behaviour of a particular data type, but you are not concerned about who implements its behaviour
>- You want to sperate different behaviour
>- The collections API is an excellent example, we have the List interface and implementation ArrayList and LinkedList
>- The JDBC API is another excellent example.  It exist of almost only interfaces.  The concrete implementations are provided as "JDBC drivers".  This enables you to write all the JDBC code independent of the DB vendor.

> Interface is a pure abstract class
``` java
// What we declare
public interface Moveable{
    int AVG_SPEED = 40;  // -> always need to be decaled; otherwise error
    void move()
}

// What the compiler sees
public interface Moveable{ // TODO -> think is changes it to an abstract class
    public static final int AVG_SPEED = 40; // -> automatically adds public static final
    public abstract void move();  // automatically adds public abstract
}
```
> Methods inside interface must not be static, final, native or stictfp
> All variables declared inside interface are implicitly public static final variables(constants)
> All methods declared inside Java Interfaces are implicitly public and abstract, even if you don't use public or abstract keyword
> Interface can extend one or more other interface
> Interface cannot implement a class (including interfaces which are abstract classesby nature)
> Interface can be nested inside another interface
> Method signature does note require 'public/private/protected ..'
> Implementor need to implement/override all methods in interface 

![Recap](images/img_0002.png)

``` java
interface ITelephone {...}
class DeskPhone implements ITelephone {...}
class MobilePhone implements ITelephone {..}
psvm = () => {
    ITelephone timsPhone;  // Generics - Good practice to declare interface and the initializing on the right

    timsPhone = new DeskPhone(123456);
    timsPhone.powerOn();
    timsPhone.callPhone(123456);
    timsPhone.answer();

    timsPhone = new MobilePhone(99999);  // Possible because of 'ITelephone timsPhone;'; would be possible if it was declared 'DeskPhone timsPhone;'
    timsPhone.powerOn();
    timsPhone.callPhone(99999);
    timsPhone.answer();
}
```
``` java
interface ITelephone {
    List<String> returnContacts();
    void printContracts(List<String> listContacts);  // -> do not have {} - which means implementation
}
class DeskPhone implements ITelephone {
    public List<String> returnContacts(){
        List<String> values = new LinkedList<>();   // -> Specify implementation of List
        values.add(0, this.name);
        return values;
    }
    public String getPhoneNumber() {return this.phoneNumber}
    public void printContracts() {....};
}
class MobilePhone implements ITelephone {
    public List<String> returnContacts(){
        List<String> values = new ArrayList<>();   // -> Specify implementation of List
        values.add(0, this.name);
        return values;
    }
    public String getPhoneNumber() {return this.phoneNumber}
    public void printContracts() {....};
}
public class Main {
    psvm = () => {
        DeskPhone timsPhone = new DeskPhone(123456);
        MobilePhone tedsPhone = new MobilePhone(99999);  
        ITelephone interPhone = new MobilePhone(99999);  

        loadObject(timsPhone); // -> going to work because of generic interface as parameter
        loadObject(tedsPhone); // -> going to work because of generic interface as parameter

        timsPhone.getPhoneNumber() // -> will works
        interPhone.getPhoneNumber() // -> will fail as getPhoneNumber() does not exist in interface 
        ((MobilePhone) interPhone).getPhoneNumber() // -> will not work after casting
    }

    public static void loadObject (ITelephone objectLoad){  // -> Generic parameter for object
        objectLoad.printContracts();
    }
}
```



## **Inner Class**
> Nested classes are divided into two categories: static and non-static.
>- Nested classes that are declared static are called **static nested classes**. 
>- Non-static nested classes are called **inner classes**.

``` java
public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
```
```
x = 23
this.x = 1
ShadowTest.this.x = 0
```

## **Inner Classes - (1) Local vs (2) Anonymous**
> There are two additional types of inner classes. 
>- You can declare an inner class within the body of a method. These classes are known as local classes. 
>- You can also declare an inner class within the body of a method without naming the class. These classes are known as anonymous classes.

> **Local Classes**
> Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces. You typically find local classes defined in the body of a method.
``` java
public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;

        // Valid in JDK 8 and later:
        // int numberLength = 10;

        class PhoneNumber {
        
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:

            //public void printOriginalNumbers() {
            //    System.out.println("Original numbers are " + phoneNumber1 +
            //        " and " + phoneNumber2);
            //}
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in JDK 8 and later:
        // myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
```

> You cannot declare static initializers or member interfaces in a local class. The following code excerpt does not compile because the method EnglishGoodbye.sayGoodbye is declared static. The compiler generates an error similar to "modifier 'static' is only allowed in constant variable declaration" when it encounters this method definition:
> https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
``` java
 public void greetInEnglish() {
        interface HelloThere { // -> compile error
            void greet();
        }
        class EnglishHelloThere implements HelloThere {
            public void greet() {
                System.out.println("Hello ");
            }
        }
        HelloThere myGreeting = new EnglishHelloThere();
        myGreeting.greet();
    }
```


> Example for inner interface
``` java
public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);  
    }

    // Inner interface 
    public interface OnClickListener{
        void onClick(String title);
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPRint = new Button("Print");

    public static void main(String[] args) {

        // Another inner class
        class ClickListener implements Button.OnClickListener{  // Implementing inner class interface 
            public ClickListener() {
                System.out.println("I've been attached");
            }

            // Forced to implement inner interface methods
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPRint.setOnClickListener(new ClickListener());  // Passing new object
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPRint.onClick();
            }
        }
    }
}
```

> **Anonymous class**
>- Extends Class
``` java
// Copy & paste in *.java file -> it will run first main method.. Comment to see others..
class HelloWorld { // superclass
    void displayMessage() {
        System.out.println("Hello World");
    }
}


class Tester {
    public static void main(String args[]){
        HelloWorld hw = new HelloWorld() {
            void displayMessage() {
                System.out.println("Hello Earth");
            }
        };
        hw.displayMessage();
    }
}

class Tester2 {
    public static void main(String args[]){
        HelloWorld hw = new HelloWorld() {
            @Override
            void displayMessage() {
                System.out.println("Hello Earth");
            }
            void displayError() {
                System.out.println("Don\'t create new methods in an anonymous inner class.");
            }
        };
        hw.displayMessage();
        //hw.displayError();
    }
}

class Tester3 {
    public static void main(String args[]){
        reallyStrange(new HelloWorld());  // -> Prints "Hello World" -> use original method
        reallyStrange(new HelloWorld(){   // -> Prints "Really strange stuff!" -> use overridden method
            @Override
            void displayMessage(){
                System.out.println("Really strange stuff!");
            }
        });
    }

    static void reallyStrange(HelloWorld hw){
        hw.displayMessage();
    }
}
```

>- Implements interface 
``` java
public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();             // -> Prints "Hello World"
        frenchGreeting.greetSomeone("Fred"); // -> Prints "Salut Fred"
        spanishGreeting.greet();             // -> PRints "Hola, mundo"
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
```


> **Abstract class**
>- Cannot instantiate an abstract class
>- Abstract classes are extended not implemented
>- Decision based "Is A" vs "Has A" relationship
> Abstract classes are similar to Interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation
> However, with Abstract classes, you can decalre fields that not static and final, and define public, protected, private concrete methods
> An Abstract class can extend only one parent class but it can implement multiple interfaces
> When an Abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in it parent class
> However, if it does not, then the subclass must also be declared abstract
> Use an abstract class when
>- You want to share code among several closely related classes (Animal - with fields name. name...)
>- You expect classes that extend your abstract class to have many commond methods or fields or required access modifiers other than public (protected, private)
>- You want to declare non static or non fial fields, this enables you to define methods thatn can access and modify the state of an object (getName, setName).
>- When you have a requirement for your base class to provide a default implementation of certain methods but other methods should be open to being overridden by child classes
>- **Summary:** The purpose of abstract class is to provide a common definiton of a base class that multiple derived calsses can share

``` java
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

public interface CanFly {
    void fly();
    //void Test();  // -> If this was set see comments starting with *
}

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wing");
    }

    //@Override
    //public void Test() { }  -> * Not required to implement because it's an abstract class
}



public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {     // -> Can be overridden
        super.fly();
        System.out.println("I'm not good at this");
    }

//    @Override
//    public void Test() { }  -> * this will need to be implemented if not already done so in inherited abstract class
}


public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

//    @Override
//    public void fly() { super.fly(); }  -> Not required as already implemented in abstract class

//    @Override
//    public void Test() { }  -> * this will need to be implemented if not already done so in inherited abstract class
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();       // -> Yorkie is eating
        dog.breathe();   // -> Breathe in, breathe out, repeat

        Parrot parrot = new Parrot("Australian Parrot");
        parrot.eat();     // -> Australian Parrot is pecking
        parrot.breathe(); // -> Breathe in, breathe out, repeat
        parrot.fly();     // -> Australian Parrot is flapping its wing

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();    // -> Emperor is flapping its win \n I'm not good at this

    }
}
```

## **Abstract Classes**
> //TODO -> review abstract classes challenge



## **Generics**
> T can extend only one class(first in the list) and add multiple interfaces
``` java
public class Team <T extends Player & Coach & Manager {  // -> Player is a class (needs to be first); Coach & Manager are interfaces
}

```