package L_06;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("Vehicle.start()");
    }

    public void startEngine(){
        System.out.println("Vehicle.startEngine()");
    }
}
