package carbuilder.exemplo.components;

/**
 * Just another feature of a car.
 */
public class Engine {
    private double mileage;
    private boolean started;

    public Engine(double mileage) {        
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getMileage() {
        return mileage;
    }
}
