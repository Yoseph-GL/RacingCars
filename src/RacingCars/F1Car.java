package racingcars;

public class F1Car extends Car {

    public F1Car(String driverName) {

        super("Ferrari", "SF-24", "Red", 350, 0, driverName); 
    }

    @Override 
    public void updateSpeed() {
        super.updateSpeed(); 
        
        double drsBoost = 1.05; // 5% extra speed
        this.currentSpeed = this.currentSpeed * drsBoost;

        System.out.println("[F1 Telemetry] DRS Active. Speed adjusted.");
    }
}
