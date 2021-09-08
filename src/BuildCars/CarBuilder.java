package BuildCars;

import BuildCars.Car;

public abstract class CarBuilder {

    protected Car car;

    public Car getCar() {
        return car;
    }

    public void createNewCar(){
        car = new Car();
    }

    public abstract void buildBrand();
    public abstract void buildModel();
    public abstract void buildHp();
    public abstract void buildTank();
    public abstract void buildDoor();



}
