package technology;

public class Computer extends AbstractEntity{
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //@Override
//    public int generateId() {
//        return super.getId();
//    }

    @Override
    public int generateId() {
        int id = nextId;
        nextId++;
        return id;
    }

    public void turnOn() {
        System.out.println("Computer is turning on...");
    }

    public void turnOff() {
        System.out.println("Computer is turning off...");
    }
}
