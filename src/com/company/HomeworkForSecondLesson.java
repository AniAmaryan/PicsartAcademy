package com.company;

public class HomeworkForSecondLesson {

    int a = 12;
    int b = 5;

    public void theArithmeticOperators() {
        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulus operator
        System.out.println("a % b = " + (a % b));

        // increment operation
        a++;
        System.out.println("Increment a : " + a);

        //decrement operation
        b--;
        System.out.println("Decrement b : " + b);
    }

    public void theRelationalOperators() {
        boolean firstValue = b == a; //false
        boolean secondValue = b != a; // true
        boolean thirdValue = b > a; //false
        boolean fourthValue = b < a; //true
        boolean fifthValue = b >= a; //false
        boolean sixthValue = b <= a; //true
    }

    public void theLogicalOperators() {
        boolean p = a > 0 && b > 10; //false
        boolean d = a > 0 || b > 10; //true
        boolean f = !p; //true
    }

    public void theAssignmentOperators() {
        a += 1; //This means a = a + 1
        a -= 1; //This means a = a - 1
        a *= 2; //This means a = a * 2
        a /= 2; //This means a = a % 2
    }

    public void arrays() {
        int[] myArray = new int[2];
        myArray[0] = a;
        myArray[1] = b;

        double[] doubleArray = {12.3, 215.2, 53.8, 142.6, 78451.994};
        System.out.println("Array length : " + myArray.length); //2
        System.out.println(myArray[myArray.length - 1]); //last element of myArray
    }

    public void conditions() {
        if (b < 20) {
            System.out.println("This is if operator");
        } else {
            System.out.println("This is else operator");
        }
        //or
        int data = b > 20 ? 10 : 0;
        System.out.println(data);
    }

    public void theSwitchStatement() {
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Default");
        }
    }
}
