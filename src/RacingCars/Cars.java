package RacingCars;

import java.util.Random;

/**
 * Represents a competition car within the simulation engine.
 * Handles physics attributes like velocity, acceleration, and position.
 */
public class Cars {

    // Attributes
    private String brand;
    private String model;
    private String color;
    private int vMax;            // Max speed in km/h
    private double currentSpeed; // Current speed in km/h
    private double position;     // Position in meters/km
    private String driverName;
    
    // Utilities
    private final Random randomGenerator = new Random();

    // Default Constructor
    public Cars() {
        this("Unknown", "Unknown", "Unknown", 0, 0, "Unknown");
    }

    // Parameterized Constructor
    public Cars(String brand, String model, String color, int vMax, int currentSpeed, String driverName) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.vMax = vMax;
        this.currentSpeed = currentSpeed;
        this.driverName = driverName;
        this.position = 0.0;
    }

    // --- Core Logic Methods ---

    /**
     * Increases speed by a random factor mimicking engine acceleration.
     */
    public void accelerate() {
        // Increases speed between 0 and 9 km/h
        this.currentSpeed += randomGenerator.nextInt(10);
    }

    /**
     * Calculates if turbo is activated.
     * @return 1.4 multiplier if turbo activates (20% chance), else 1.0.
     */
    private double getTurboMultiplier() {
        // 20% chance of turbo boost
        if (randomGenerator.nextDouble() < 0.2) {
            System.out.println(">>> TURBO BOOST ACTIVATED FOR " + this.driverName + "! <<<");
            return 1.4; // 40% speed boost
        }
        return 1.0;
    }

    /**
     * Updates the car's speed applying turbo logic and capping at vMax.
     */
    public void updateSpeed() {
        this.currentSpeed = this.currentSpeed * getTurboMultiplier();
        
        // Cap speed at vMax
        if (this.currentSpeed > this.vMax) {
            this.currentSpeed = this.vMax;
        }
    }

    /**
     * Updates the car's position based on current speed.
     */
    public void updatePosition() {
        this.position += this.currentSpeed;
    }

    public void showInformation() {
        System.out.println("\n--- Car Telemetry ---");
        System.out.println("Driver: " + this.driverName);
        System.out.println("Vehicle: " + this.brand + " " + this.model + " (" + this.color + ")");
        System.out.println("Max Speed: " + this.vMax + " km/h");
        System.out.printf("Current Speed: %.2f km/h%n", this.currentSpeed);
        System.out.printf("Position: %.2f%n", this.position);
    }

    // --- Getters and Setters ---
   

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getVMax() { return vMax; }
    public void setVMax(int vMax) { this.vMax = vMax; }

    public double getCurrentSpeed() { return currentSpeed; }
    // No setter for currentSpeed normally needed as logic handles it, but ok to keep if required.

    public double getPosition() { return position; }
    
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
}
