package Polymorphism;

public class CruiseShip extends Ship {
    private int maxNumberOfPassengers;

    public CruiseShip(String shipName, String yearBuilt, int maxNumberOfPassengers){
        super(shipName, yearBuilt);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }
    public int getMaxNumberOfPassengers(){
        return maxNumberOfPassengers;
    }

    @Override
    public void display(){
        System.out.println("Name: " + getShipName() + "\nMax Number of Passengers: " + getMaxNumberOfPassengers());
    }
}
