package org.example.electronicdevices;

public class Laptop extends Device {
    //ramSize: int, processorType: String
    protected int ramSize;
    protected String processorType;
    public Laptop() {}
    public Laptop(DeviceType type, String name, double price, double weight){
        super(type, name, price, weight);
    }
    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String processorType){
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + ramSize +
                ", resolution=" + processorType +
                '}';
    }
}
