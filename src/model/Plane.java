package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan,
                 int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println("Model " + model);
        System.out.println("Country " + country);
        System.out.println("Year " + year);
        System.out.println("Hours " + hours);
        System.out.println("Military " + (military ? "Yes" : "No"));
        System.out.println("Weight " + weight);
        System.out.println("Wingspan " + wingspan);
        System.out.println("TopSpeed " + topSpeed);
        System.out.println("Seats " + seats);
        System.out.println("Cost " + cost);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && model.length() != 0) {
            this.model = model;
        } else {
            System.out.println("Model's name is empty");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && country.length() != 0) {
            this.country = country;
        } else {
            System.out.println("Country's name is empty");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Not valid year");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && year <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Not valid hour");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Not valid weight");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (topSpeed >= 0) {
            this.seats = seats;
        } else {
            System.out.println("The seats number is negative");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
