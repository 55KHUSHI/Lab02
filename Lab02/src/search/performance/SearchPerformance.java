package search.performance;

import java.util.Scanner;

public class SearchPerformance {

    // Method for Linear Search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Key found
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the key to search for
        System.out.print("Enter the key to search for: ");
        int key = scanner.nextInt();

        // Measure the time taken to perform linear search
        long startTime = System.currentTimeMillis();
        int index = linearSearch(array, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Output the results
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }

        // Output the time taken
        System.out.println("Execution time: " + executionTime + " milliseconds");

        scanner.close();
    }
}
