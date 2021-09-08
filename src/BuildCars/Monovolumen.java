package BuildCars;

import BuildCars.CarBuilder;

public class Monovolumen extends CarBuilder {
    @Override
    public void buildBrand() {
        car.setBrand("Ford");
    }

    @Override
    public void buildModel() {
        car.setModel("S-Max");
    }

    @Override
    public void buildHp() {
        car.setHp(190);
    }

    @Override
    public void buildTank() {
        car.setFuel("Hibrido");
    }

    @Override
    public void buildDoor() {
        car.setNumDoor(4);
    }
}
