package main;

import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();
        Plane firstPlane = planeService.create();
        Plane secondPlane = planeService.create();
        Plane thirdPlane = planeService.create();
        Plane fourthPlane = planeService.create();
        Plane[] arrayOfPlanes = {firstPlane, secondPlane, thirdPlane, fourthPlane};

        System.out.println("Task 2");
        System.out.println();
        //Task 2
        planeService.isMilitary(firstPlane);

        System.out.println("Task 3");
        System.out.println();
        //Task 3
        planeService.isNewer(firstPlane, secondPlane);

        System.out.println("Task 4");
        System.out.println();
        //Task 4
        planeService.isBiggerWingspan(thirdPlane, fourthPlane);

        System.out.println("Task 5");
        System.out.println();
        //Task 5
        planeService.smallestSeatsCount(firstPlane, secondPlane, thirdPlane);

        System.out.println("Task 6");
        System.out.println();
        //Task 6
        planeService.nonMilitaryPlanes(arrayOfPlanes);

        System.out.println("Task 7");
        System.out.println();
        //Task 7
        planeService.militaryPlanesMoreThanOneHundredHoursInAir(arrayOfPlanes);

        System.out.println("Task 8");
        System.out.println();
        //Task 8
        planeService.smallestWeightPlane(arrayOfPlanes);

        System.out.println("Task 9");
        System.out.println();
        //Task 9
        planeService.cheapestMilitaryPlane(arrayOfPlanes);

        System.out.println("Task 10");
        System.out.println();
        //Task 10
        planeService.ascendingByPlaneYear(arrayOfPlanes);

    }

}
