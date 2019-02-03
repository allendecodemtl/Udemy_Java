package L_04_AbstractClasses;

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
