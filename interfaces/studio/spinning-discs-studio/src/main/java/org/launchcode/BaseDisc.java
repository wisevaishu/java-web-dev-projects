package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    private String name;
    private double capacity;
    private String contents;
    private String discType;
    private double writeCapacity;

    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getWriteCapacity() {
        return writeCapacity;
    }

    public void setWriteCapacity(double writeCapacity) {
        this.writeCapacity = writeCapacity;
    }

    @Override
    public String toString() {
        return "Disc Type: " + discType +
                "\nName: " + name +
                "\nCapacity: " + capacity +
                "\nContents: " + contents;
    }


    public abstract void writeData(double dataWritten);

}
