package BuildCars;

import BuildCars.CarBuilder;

public class Coupe extends CarBuilder {


    @Override
    public void buildBrand() {
        car.setBrand("Aston Martin");
    }

    @Override
    public void buildModel() {
        car.setModel("Vantage");
    }

    @Override
    public void buildHp() {
        car.setHp(510);
    }

    @Override
    public void buildTank() {
        car.setFuel("Gasolina");
    }

    @Override
    public void buildDoor() {
        car.setNumDoor(2);
    }
}
