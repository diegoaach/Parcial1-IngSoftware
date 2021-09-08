package BuildCars;

public class Car {

    private String brand;
    private String model;
    private int hp;
    private String fuel;
    private int numDoor;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public String getFuel() {
        return fuel;
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void desc() {
        System.out.println("Marca: "+ brand +"\n"+
                "Modelo: "+ model +"\n"+
                "Potencia: "+String.valueOf(hp)+"\n"+
                "Combustible: "+ fuel +"\n"+
                "Numero de puertas: "+String.valueOf(numDoor)+"\n");
    }
}
