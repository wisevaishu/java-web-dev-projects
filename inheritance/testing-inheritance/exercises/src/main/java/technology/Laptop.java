package technology;

public class Laptop extends Computer{
    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    @Override
    public int generateId() {
        return super.generateId();
    }



    public void adjustBrightness() {
        System.out.println("Adjusting brightness of the laptop screen...");
    }
}
