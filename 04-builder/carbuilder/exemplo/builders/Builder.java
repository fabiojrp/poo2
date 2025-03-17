package carbuilder.exemplo.builders;

import carbuilder.exemplo.cars.CarType;
import carbuilder.exemplo.components.Engine;
import carbuilder.exemplo.components.GPSNavigator;
import carbuilder.exemplo.components.Transmission;
import carbuilder.exemplo.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}