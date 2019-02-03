package L_04_AbstractClasses;

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
