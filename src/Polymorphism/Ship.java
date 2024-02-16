package Polymorphism;

public class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt){
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName(){
        return shipName;
    }
    public String getYearBuilt(){
        return yearBuilt;
    }
    public void display(){
        System.out.println("Name: " + shipName + "\nYear Built: " + yearBuilt);
    }
}
