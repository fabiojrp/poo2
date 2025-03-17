package carbuilder.exemplo;

import carbuilder.exemplo.builders.CarBuilder;
import carbuilder.exemplo.builders.CarManualBuilder;
import carbuilder.exemplo.cars.Car;
import carbuilder.exemplo.cars.Manual;
import carbuilder.exemplo.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
      
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        
        
        

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}