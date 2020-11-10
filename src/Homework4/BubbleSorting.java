package Homework4;

public class BubbleSorting {
    public static void main(String[] args) {
        BubbleSorting sorting = new BubbleSorting();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorted array");
        sorting.bubbleSort(arr);
    }

    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        for (int j : arr) System.out.print(j + " ");
    }
}