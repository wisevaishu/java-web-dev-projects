package org.launchcode;

public class StartClass {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD myCd = new CD("ARR Hits", 700, "Melody", "CD");

        myCd.spinDisc();
        myCd.storeData(); // Implement this method in CD class
        myCd.writeData(350); // Implement this method in CD class
        myCd.readData();  // Implement this method in CD class
        myCd.reportInformation();
    }
}