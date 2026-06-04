package racingcars;

import java.util.Random;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int vMax;
    private double currentSpeed;
    private double position;
    private String driverName;

    private final Random randomGenerator = new Random();

    public Car() {
        this("Unknown", "Unknown", "Unknown", 0, 0.0, "Unknown");
    }

    public Car(String brand, String model, String color, int vMax, double currentSpeed, String driverName) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.vMax = vMax;
        this.currentSpeed = currentSpeed;
        this.driverName = driverName;
        this.position = 0.0;
    }

    public void accelerate() {
        this.currentSpeed += randomGenerator.nextInt(10);
    }

    protected double getTurboMultiplier() {
        if (randomGenerator.nextDouble() < 0.2) {
            System.out.println(">>> TURBO BOOST ACTIVATED FOR " + this.driverName + "! <<<");
            return 1.4;
        }
        return 1.0;
    }

    public void updateSpeed() {
        this.currentSpeed = this.currentSpeed * getTurboMultiplier();

        if (this.currentSpeed > this.vMax) {
            this.currentSpeed = this.vMax;
        }
    }

    public void updatePosition() {
        this.position += this.currentSpeed;
    }

    public void showInformation() {
        System.out.println("\n--- Car Telemetry ---");
        System.out.println("Driver: " + this.driverName);
        System.out.println("Vehicle: " + this.brand + " " + this.model + " (" + this.color + ")");
        System.out.printf("Current Speed: %.2f km/h%n", this.currentSpeed);
        System.out.printf("Position: %.2f%n", this.position);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVMax() {
        return vMax;
    }

    public void setVMax(int vMax) {
        this.vMax = vMax;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getPosition() {
        return position;
    }

}
