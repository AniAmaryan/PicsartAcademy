package com.company;

public class Homeworks {
    public static void main(String[] args) {
        Homeworks homework = new Homeworks();
        homework.nonRepeating();
    }

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

    //Task 1
    //Create an array and fill it with 2 number.
    public void task1() {
        int[] arrayForTaskOne = new int[10];
        for (int i = 0; i < arrayForTaskOne.length; i++) {
            arrayForTaskOne[i] = 2;
            System.out.print(arrayForTaskOne[i] + " ");
        }
    }

    //Task 2
    //Create an array and fill it with numbers from 1:1000.
    public void task2() {
        int[] arrayForTaskTwo = new int[1000];
        for (int i = 0; i < arrayForTaskTwo.length; i++) {
            arrayForTaskTwo[i] = i + 1;
            System.out.println(arrayForTaskTwo[i]);
        }
    }

    //Task 3
    //Create an array and fill it with odd numbers from -20:20
    public void task3() {
        int[] arrayForTaskThree = new int[20];
        for (int i = 0, j = -19; i < arrayForTaskThree.length; i++, j += 2) {
            arrayForTaskThree[i] = j;
            System.out.print(arrayForTaskThree[i] + " ");
        }
    }

    //Task 4
    //Create an array and fill it. Print all elements which can be divided by 5.
    public void task4() {
        int[] arrayForTaskFour = {1, 56, 78, 4, 20, 0, 6, 5};
        for (int i = 0; i < arrayForTaskFour.length; i++) {
            if (arrayForTaskFour[i] % 5 == 0) {
                System.out.print(arrayForTaskFour[i] + " ");
            }
        }
    }

    //Task 5
    //Create an array and fill it. Print all elements which are between 24.12 and 467.23.
    public void task5() {
        double[] arrayForTaskFive = new double[500];
        for (int i = 0; i < arrayForTaskFive.length; i++) {
            if (i >= 24.12 && arrayForTaskFive[i] <= 467.23) {
                arrayForTaskFive[i] = i;
                System.out.println(arrayForTaskFive[i]);
            }
        }
    }

    //Task 6
    //Create an array and fill it. Print count of elements which can be divided by 2.
    public void task6() {
        int countOfElements = 0;
        int[] arrayForTaskSix = new int[10];
        for (int i = 0; i < arrayForTaskSix.length; i += 2) {
            countOfElements++;
            arrayForTaskSix[i] = i;
            System.out.print(arrayForTaskSix[i] + " ");
        }
        System.out.println(countOfElements);
    }

    //Task 7
    //Given an integer, 0< N < 21 , print its first 10 multiples.
    //Each multiple N x i (where 0<i<11)
    //should be printed on a new line in the
    //form: N x i = result.
    public void task7() {
        int n;
        for (n = 1; n < 21; n++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + i * n);
            }
            System.out.println("____________");
        }
    }

    public void nonRepeating() {
        int arr[] = {9, 4, 9, 6, 4, 4};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && (arr[i] ^ arr[j]) == 0)
                    break;
            if (j == n)
                System.out.print(arr[i] + " ");
        }
    }
}
