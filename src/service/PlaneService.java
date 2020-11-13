package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    //Task 1. (score 5)
    //Create function:
    //Parameter one Plane
    //Result: print all information of the plane
    public Plane create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model");
        String model = scanner.next();
        System.out.println("Enter country");
        String country = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter hours");
        int hours = scanner.nextInt();
        System.out.println("Enter is the plane military Y for (Yes) or N for (NO)");
        char answer = scanner.next().charAt(0);
        boolean military = (answer == 'y' || answer == 'Y');
        System.out.println("Enter weight");
        int weight = scanner.nextInt();
        System.out.println("Enter wingspan");
        int wingspan = scanner.nextInt();
        System.out.println("Enter topSpeed");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter seats");
        int seats = scanner.nextInt();
        System.out.println("Enter cost");
        double cost = scanner.nextDouble();

        Plane plane = new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
        plane.printInfo();

        return plane;
    }

    //Task 2. (score 5)
    //Create function:
    //Parameter one Plane
    //Result: print cost and topSpeed if the plane is military otherwise print model and country
    public void isMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost : " + plane.getCost());
            System.out.println("Top speed : " + plane.getTopSpeed());
        } else {
            System.out.println("Model : " + plane.getModel());
            System.out.println("Country : " + plane.getCountry());
        }
    }

    //Task 3. (score 7)
    //Create function:
    //Parameter two Planes
    //Result: return the plane which one is newer (if they have the same age return first one).
    public Plane isNewer(Plane firstPlane, Plane secondPlane) {
        if (firstPlane.getYear() < secondPlane.getYear()) {
            return secondPlane;
        } else return firstPlane;
    }

    //Task 4. (score 7)
    //Create function:
    //Parameter two Planes
    //Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
    public Plane isBiggerWingspan(Plane firstPlane, Plane secondPlane) {
        if (firstPlane.getWingspan() > secondPlane.getWingspan()) {
            return firstPlane;
        } else return secondPlane;
    }

    //Task 5. (score 7)
    //Create function:
    //Parameter three Planes
    //Result: print country of the plane with smallest seats count (if they have the same - print first).
    public void smallestSeatsCount(Plane firstPlane, Plane secondPlane, Plane thirdPlane) {
        if ((firstPlane.getSeats() < secondPlane.getSeats()) && (firstPlane.getSeats() < thirdPlane.getSeats())) {
            System.out.println("Country : " + firstPlane.getCountry());
        } else if (secondPlane.getSeats() < thirdPlane.getSeats()) {
            System.out.println("Country : " + secondPlane.getCountry());
        } else System.out.println("Country : " + thirdPlane.getCountry());
    }

    //Task 6. (score 7)
    //Create function:
    //Parameter array of Planes
    //Result: print all not military planes.
    public void nonMilitaryPlanes(Plane[] planes) {
        System.out.println("Non military planes list :");
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                plane.printInfo();
            }
        }
    }

    //Task 7. (score 10)
    //Create function:
    //Parameter array of Planes
    //Result: print all military planes which were in air more than 100 hours.
    public void militaryPlanesMoreThanOneHundredHoursInAir(Plane[] planes) {
        System.out.println("Military planes list which were in air more than 100 hours :");
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                plane.printInfo();
            }
        }
    }

    //Task 8. (score 10)
    //Create function:
    //Parameter array of Planes
    //Result: return the plane with minimal weight (if there are some of them return last one).
    public Plane smallestWeightPlane(Plane[] planes) {
        System.out.println("The plane with minimal weight :");
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < planes.length; i++) {
                if (planes[i - 1].getWeight() < planes[i].getWeight()) {
                    Plane temp = planes[i];
                    planes[i] = planes[i - 1];
                    planes[i - 1] = temp;
                    swapped = true;
                }
            }
        }
        return planes[planes.length - 1];
    }

    //Task 9. (score 10)
    //Create function:
    //Parameter array of Planes
    //Result: return the plane with minimal cost from all military planes (if there are some of them return first one).
    public Plane cheapestMilitaryPlane(Plane[] planes) {
        System.out.println("The military plane with minimal cost :");
        Plane min = null;
        for (int i = 0; i < planes.length; i++) {
            if (min == null) {
                if (planes[i].isMilitary()) {
                    min = planes[i];
                }
            } else {
                if (planes[i].isMilitary() && planes[i].getCost() < min.getCost()) {
                    min = planes[i];
                }
            }
        }
        if (min == null) {
            System.out.println("There is no any military plane ");
        }
        return min;
    }

    //Task 10. (score 12)
    //Create function:
    //Parameter array of Planes
    //Result: print planes in ascending form order by year
    public void ascendingByPlaneYear(Plane[] planes) {
        System.out.println("The planes in ascending form order by year : ");
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < planes.length; i++) {
                if (planes[i - 1].getYear() > planes[i].getYear()) {
                    Plane temp = planes[i];
                    planes[i] = planes[i - 1];
                    planes[i - 1] = temp;
                    swapped = true;
                }
            }
        }
        for (Plane plane : planes) {
                plane.printInfo();
            }
    }

}
