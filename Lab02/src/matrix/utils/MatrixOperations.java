package matrix.utils;

import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of rows and columns from command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide the number of rows and columns as command-line arguments.");
            return;
        }

        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);

        int[][] matrix = new int[rows][cols];

        // Read the elements of the matrix from the console
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Menu-driven program
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of all elements");
            System.out.println("2. Print the data in matrix form");
            System.out.println("3. Print the elements of principal diagonal");
            System.out.println("4. Print the sum of elements in Principal diagonal");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            sum += matrix[i][j];
                        }
                    }
                    System.out.println("Sum of all elements: " + sum);
                    break;
                case 2:
                    System.out.println("Matrix:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (rows != cols) {
                        System.out.println("Matrix is not square, so principal diagonal cannot be determined.");
                    } else {
                        System.out.print("Elements of Principal Diagonal: ");
                        for (int i = 0; i < rows; i++) {
                            System.out.print(matrix[i][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    if (rows != cols) {
                        System.out.println("Matrix is not square, so principal diagonal sum cannot be determined.");
                    } else {
                        int diagonalSum = 0;
                        for (int i = 0; i < rows; i++) {
                            diagonalSum += matrix[i][i];
                        }
                        System.out.println("Sum of Principal Diagonal elements: " + diagonalSum);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}
