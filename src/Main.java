import BuildCars.*;

public class Main {
    
    public static void main(String[] args){

        Client client = new Client();

        CarBuilder coupe = new Coupe();
        CarBuilder berlina = new Berlina();
        CarBuilder monovolumen = new Monovolumen();

        System.out.println("**** Coupe ****\n");

        client.setCarBuilder(coupe);
        client.assembleCar();
        Car car1 = client.getCar();
        car1.desc();

        System.out.println("**** Berlina ****\n");

        client.setCarBuilder(berlina);
        client.assembleCar();
        Car car2 = client.getCar();
        car2.desc();

        System.out.println("**** Monovolumen ****\n");

        client.setCarBuilder(monovolumen);
        client.assembleCar();
        Car car3 = client.getCar();
        car3.desc();
        
    }
}
