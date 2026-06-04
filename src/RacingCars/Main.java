package racingcars;

public class Main {

    public static void main(String[] args) {

        Car roadCar = new Car("McLaren", "P1", "Orange", 320, 0.0, "Joseph");
        F1Car f1Car = new F1Car("Hamilton");

        System.out.println("=== Racing Simulation ===\n");

        for (int tick = 1; tick <= 5; tick++) {
            System.out.println("--- Tick " + tick + " ---");

            roadCar.accelerate();
            roadCar.updateSpeed();
            roadCar.updatePosition();
            roadCar.showInformation();

            f1Car.accelerate();
            f1Car.updateSpeed();
            f1Car.updatePosition();
            f1Car.showInformation();
        }

        System.out.println("\n=== Race Finished ===");
    }
}
