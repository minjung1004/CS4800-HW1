package Polymorphism;

public class CargoShip extends Ship{
    private int cargoCapacityTonnage;
    public CargoShip(String shipName, String yearBuilt, int cargoCapacityTonnage) {
        super(shipName, yearBuilt);
        this.cargoCapacityTonnage = cargoCapacityTonnage;
    }
    public int getCargoCapacityTonnage(){
        return cargoCapacityTonnage;
    }

    @Override
    public void display(){
        System.out.println("Name: " + getShipName() + "\nCargo Capacity(tonnage): " + getCargoCapacityTonnage());
    }
}
