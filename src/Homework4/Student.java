package Homework4;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int year;
    private int mark;


    public void printName() {
        System.out.println(firstName + " " + lastName + ": " + mark);
    }

    public void printBirth() {
        System.out.println(year);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMark() {
        return mark;
    }


    public void setMark(int mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1950 && year <= 2020) {
            this.year = year;
        }
    }
}
