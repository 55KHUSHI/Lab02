package University;

import java.util.Scanner;

public class Student {
    // Private attributes
    private String name;
    private int id;
    private char gender;
    private String department;

    // Setter for Name with validation
    public void setName(String name) {
        if (name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name must not contain special characters or digits.");
        }
    }

    // Setter for ID with validation
    public void setId(int id) {
        if (String.valueOf(id).length() == 9 && id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID must be a positive 9-digit number.");
        }
    }

    // Setter for Gender with validation
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender. Gender must be either 'M' or 'F'.");
        }
    }

    // Setter for Department with validation
    public void setDepartment(String department) {
        if (department.equals("BT") || department.equals("CE") || department.equals("CSE") || 
            department.equals("ECE") || department.equals("EEE") || department.equals("ECS") || 
            department.equals("ME") || department.equals("PE")) {
            this.department = department;
        } else {
            System.out.println("Invalid department. Department must be one of BT/CE/CSE/ECE/EEE/ECS/ME/PE.");
        }
    }

    // toString method to display the Student details
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nGender: " + gender + "\nDepartment: " + department;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Input details for student 1
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        student1.setName(scanner.nextLine());
        System.out.print("ID: ");
        student1.setId(scanner.nextInt());
        System.out.print("Gender (M/F): ");
        student1.setGender(scanner.next().charAt(0));
        scanner.nextLine(); // Consume the newline
        System.out.print("Department: ");
        student1.setDepartment(scanner.nextLine());

        // Input details for student 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        student2.setName(scanner.nextLine());
        System.out.print("ID: ");
        student2.setId(scanner.nextInt());
        System.out.print("Gender (M/F): ");
        student2.setGender(scanner.next().charAt(0));
        scanner.nextLine(); // Consume the newline
        System.out.print("Department: ");
        student2.setDepartment(scanner.nextLine());

        // Print student details
        System.out.println("\nStudent 1 Details:\n" + student1);
        System.out.println("\nStudent 2 Details:\n" + student2);

        scanner.close();
    }
}
