/* PCACM
Package: RacingCars
Class: Cars
Attributes
Methods
 */


package RacingCars; // Package declaration

import java.util.Random; //
public class Cars { // Class declaration

    // Attributes
    private String brand; // Attribute for the car brand
    private String model; // Attribute for the car model
    private String color; // Attribute for the car color
    private int vMax; // Attribute for the maximum speed, km/h
    private double currentSpeed; // Attribute for the acceleration, km/h
    private double position; // Attribute for the position in the
    private String driverName;
    private Random randomGenerator = new Random();

    public Cars() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.vMax = 0;
        this.currentSpeed = 0.0;
        this.position = 0.0;
        this.driverName = "Unknown";
    } // End of default constructor

    // Parameterized  constructor
    public Cars(String brand, String model, String color, int vMax, int acceleration, String driverName) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.vMax = vMax;
        this.currentSpeed = acceleration;
        this.position = 0;
        this.driverName = driverName;
    } // End of parameterized constructor

    //Getter and Setter methods

    public String getBrand() { // getter for brand
        return brand;
    } // End of getBrand method

    public void setBrand(String brand) { // setter for brand
        this.brand = brand;
    } // End of setBrand method

    public String getModel() { // getter for model
        return model;
    } // End of getModel method

    public void setmodel(String model) { // setter for model
        this.model = model;
    } // End of setModel method

    public String getColor() { // getter for color
        return color;
    } // End of getColor method

    public void setColor(String color) { // setter for color
        this.color = color;
    } // End of setColor method

    public int getvMax() { // getter for vMax
        return vMax;
    } // End of getvMax method

    public void setvMax(int vMax) { // setter for vMax
        this.vMax = vMax;
    } // End of servMax method

    public double getCurrentSpeed() { // getter for acceleration
        return currentSpeed;
    } // End of getAcceleration method

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    } // End of setAcceleration method

    public double getPosition() { // getter for position}
        return position;
    } // End of getPosition method

    public void setPosition(int position) { // setter for position}
        this.position = position;
    } // End of setPosition method

    public String getDriverName() { // getter for driverName} // getter for driverName
        return driverName;
    } // End of getDriverName method

    public void setDriverName(String driverName) { // setter for driverName
        this.driverName = driverName;
    } // End of setDriverName method

    //Methods
    public double acceleration() { // Method to accelerate the car}
        double acceleration = randomGenerator.nextInt(10);
        return acceleration;
    } // End of accelerate method

    public double turboBoost() { // Method to boost the car
        double randomTurbo = randomGenerator.nextDouble(); // Random factor between 0 and 1
        if (randomTurbo < 0.2) {  // 20% chance of turbo boost
            randomTurbo = 1.4; // 40% increase in acceleration
            return randomTurbo;
        } else {
            randomTurbo = 1.0; // No turbo boost
            return randomTurbo;
        }
    } // End of turboBoost method

    public void currentSpeed() { // Method to calculate current speed
        this.currentSpeed = this.currentSpeed + (acceleration() * turboBoost());
    } // End of currentSpeed method

    public void velocidadFinal() { // Method to calculate final velocity
        currentSpeed();
        if (this.currentSpeed > this.vMax) {
            this.currentSpeed = this.vMax;
        }

    } // End of VelocityFinal method


} // End of end class

//test