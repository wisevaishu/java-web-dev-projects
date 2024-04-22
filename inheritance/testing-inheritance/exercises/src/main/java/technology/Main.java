package technology;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Inspiron", 899.99);
        Laptop laptop = new Laptop("HP", "Pavilion", 1299.99, 15.6);
        SmartPhone phone = new SmartPhone("Samsung", "Galaxy S20", 999.99, "5G");


        System.out.println("Computer ID: " + computer.generateId());
        System.out.println("Laptop ID: " + laptop.generateId());
        System.out.println("SmartPhone ID: " + phone.generateId());

        computer.turnOn();
        laptop.adjustBrightness();
        phone.connectToInternet();
    }
}
