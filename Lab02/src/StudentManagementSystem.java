package com.example.studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create Student");
            System.out.println("2. Display All");
            System.out.println("3. Delete Student");
            System.out.println("4. Delete ith Student");
            System.out.println("5. Delete 1st Student");
            System.out.println("6. Sorting by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    deleteIthStudent();
                    break;
                case 5:
                    deleteFirstStudent();
                    break;
                case 6:
                    sortByID();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    private static void createStudent() {
        System.out.print("How many students do you want to create? ");
        int count = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            students.add(new Student(id, name));
        }
    }

    private static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.id == id) {
                students.remove(student);
                found = true;
                System.out.println("Student with ID " + id + " deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private static void deleteIthStudent() {
        System.out.print("Enter index (i) of student to delete: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Student at index " + index + " deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void deleteFirstStudent() {
        if (!students.isEmpty()) {
            students.remove(0);
            System.out.println("First student deleted.");
        } else {
            System.out.println("No students to delete.");
        }
    }

    private static void sortByID() {
        Collections.sort(students, Comparator.comparingInt(student -> student.id));
        System.out.println("Students sorted by ID.");
    }
}
