package L_02;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String email;

    public VipPerson() {
        this("Default_Name", 100, "Default_Email");
    }

    public VipPerson(String name, String email) {
        this(name, 200, email);
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
