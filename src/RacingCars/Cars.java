/* PCACM
Package: RacingCars
Class: Cars
Attributes
Methods
 */


package RacingCars; // Package declaration

import java.security.SecureRandom;

public class Cars { // Class declaration

    // Attributes
    private String brand; // Attribute for the car brand
    private String model; // Attribute for the car model
    private String color; // Attribute for the car color
    private int vMax; // Attribute for the maximum speed
    private int acceleration; // Attribute for the acceleration
    private int position; // Attribute for the position in the
    private String driverName;

    public Cars() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.vMax = 0;
        this.acceleration = 0;
        this.position = 0;
        this.driverName = "Unknown";
} // End of class Cars


    // Parameterized  constructor
    public Cars(String brand, String model, String color, int vMax, int acceleration, String driverName) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.vMax = vMax;
        this.acceleration = acceleration;
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

    public int getAcceleration() { // getter for acceleration
        return acceleration;
    } // End of getAcceleration method

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    } // End of setAcceleration method

    public int getPosition() { // getter for position}
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
} // End of default constructor

//Methods


//test