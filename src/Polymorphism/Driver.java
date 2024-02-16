package Polymorphism;

public class Driver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Queen Mary", "1945");
        ships[1] = new CruiseShip("Carnival", "2012", 100);
        ships[2] = new CargoShip("Maryland", "1999", 3000);

        for (Ship ship: ships){
            ship.display();
            System.out.println();
        }

    }
}
