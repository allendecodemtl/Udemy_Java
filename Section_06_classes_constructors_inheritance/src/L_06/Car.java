package L_06;

public class Car extends Vehicle {
    private int id;

    public Car(String name, int id) {
        super(name);
        this.id = id;
    }

    public void start(){
        System.out.println("Car.start()");
        this.startEngine();
    }

//    public void startEngine(){
//        System.out.println("Car.startEngine()");
//    }
}
