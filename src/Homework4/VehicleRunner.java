package Homework4;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.setPassengers(6);
        minivan.setFuelcap(18);
        minivan.setMpg(20);

        sportscar.setPassengers(2);
        sportscar.setFuelcap(14);
        sportscar.setMpg(12);

        gallons = minivan.fuelneeded(dist);

        System.out.println("To overcome " + dist + " miles a minivan needs " + gallons + " gallons of fuel");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To overcome " + dist + " miles a sportscar needs " + gallons + " gallons of fuel");


    }
}
