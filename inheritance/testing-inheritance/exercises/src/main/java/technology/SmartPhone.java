package technology;

public class SmartPhone extends Computer{
    private String networkType;

    public SmartPhone(String brand, String model, double price, String networkType) {
        super(brand, model, price);
        this.networkType = networkType;
    }

    @Override
    public int generateId() {
        return super.generateId();
    }



    public void connectToInternet() {
        System.out.println("Connecting to the internet via smartphone...");
    }
}
