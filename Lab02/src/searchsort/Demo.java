package searchsort;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    // Method for Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }

    // Method for Binary Search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // Return the index of the found element
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the element is not found
    }

    // Method for Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a set of integers as command line arguments.");
            return;
        }

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Bubble Sort");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the key to search (Linear Search): ");
                    int linearKey = scanner.nextInt();
                    int linearResult = linearSearch(arr, linearKey);
                    if (linearResult == -1) {
                        System.out.println("Key not found.");
                    } else {
                        System.out.println("Key found at index: " + linearResult);
                    }
                    break;

                case 2:
                    bubbleSort(arr); // Ensure the array is sorted before binary search
                    System.out.print("Enter the key to search (Binary Search): ");
                    int binaryKey = scanner.nextInt();
                    int binaryResult = binarySearch(arr, binaryKey);
                    if (binaryResult == -1) {
                        System.out.println("Key not found.");
                    } else {
                        System.out.println("Key found at index: " + binaryResult);
                    }
                    break;

                case 3:
                    bubbleSort(arr);
                    System.out.println("Array sorted using Bubble Sort:");
                    System.out.println(Arrays.toString(arr));
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

