package BuildCars;

import BuildCars.Car;
import BuildCars.CarBuilder;

public class Client {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public CarBuilder getCarBuilder() {
        return carBuilder;
    }

    public Car getCar(){
        return carBuilder.getCar();
    }

    public void assembleCar(){
        carBuilder.createNewCar();
        carBuilder.buildBrand();
        carBuilder.buildModel();
        carBuilder.buildHp();
        carBuilder.buildTank();
        carBuilder.buildDoor();
    }
}
