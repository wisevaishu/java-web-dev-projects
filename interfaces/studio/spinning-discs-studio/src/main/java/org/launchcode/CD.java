package org.launchcode;

public class CD extends BaseDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base
    //  class and which ones
    //  need to be declared separately.


    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc(){
        System.out.println("Interface method implementation \n " +
                "A Cd spins 250 rpm");
    }

    @Override
    public void storeData(){
        this.setCapacity(500);
    }

    @Override
    public void writeData(double dataWritten){
        if (dataWritten>this.getCapacity()){
            System.out.println("Maximum space is 500");
        }
        else {
            this.setWriteCapacity(dataWritten);
            double remainingCapacity=this.getCapacity()-dataWritten;
            this.setCapacity(remainingCapacity);
            System.out.println("Remaining Capacity to write : " +this.getCapacity());
        }
    }

    @Override
    public void readData()
    {
        System.out.println("The total data you can read in this disc is : " +this.getWriteCapacity());
    }

    @Override
    public void reportInformation(){
        System.out.println(this.toString());
    }
}
