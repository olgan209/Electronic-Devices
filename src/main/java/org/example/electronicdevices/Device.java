package org.example.electronicdevices;

public class Device {
    private DeviceType type;
    private String name;
    private double price;
    private double weight;

    public Device(DeviceType type, String name, double price, double weight) {
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Device(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public Device(){}
}
