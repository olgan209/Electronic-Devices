package org.example.electronicdevices;

public class Smartphone extends Device {
    //screenSize: double, cameraResolution: double
    protected double screenSize;
    protected double cameraResolution;

    public Smartphone() {}
    public Smartphone(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }
    public Smartphone(DeviceType type, String name, double price, double weight, int screenSize, int resolution){
        super(type, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = resolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
