package racingcars;

public class F1Car extends Car {

    public F1Car(String driverName) {
      
        super("Ferrari", "SF-24", "Red", 350, 0, driverName); 
    }

    @Override 
    public void updateSpeed() {
        
        double drsBoost = 1.8; 
        super.updateSpeed(); 
  
    }
}
