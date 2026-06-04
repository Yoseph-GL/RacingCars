package racingcars;

public class F1Car extends Car {

    private static final double DRS_BOOST_MULTIPLIER = 1.05;

    public F1Car(String driverName) {
        super("Ferrari", "SF-24", "Red", 350, 0.0, driverName);
    }

    @Override
    public void updateSpeed() {
        double speedBefore = getCurrentSpeed();

        super.updateSpeed();

        double speedAfter = getCurrentSpeed();
        setCurrentSpeed(speedAfter * DRS_BOOST_MULTIPLIER);

        if (getCurrentSpeed() > getVMax()) {
            setCurrentSpeed(getVMax());
        }

        if (getCurrentSpeed() != speedBefore) {
            System.out.println("[F1 Telemetry] DRS Active. +5% top-end boost applied.");
        }
    }
}
