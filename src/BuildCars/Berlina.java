package BuildCars;

public class Berlina extends CarBuilder {

    @Override
    public void buildBrand() {
        car.setBrand("Toyota");
    }

    @Override
    public void buildModel() {
        car.setModel("Camry LE Hybrid");
    }

    @Override
    public void buildHp() {
        car.setHp(208);
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
