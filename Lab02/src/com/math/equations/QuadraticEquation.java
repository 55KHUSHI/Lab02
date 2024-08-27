package com.math.equations;

public class QuadraticEquation {
    // Private data fields
    private double a;
    private double b;
    private double c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to calculate discriminant
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // Method to calculate the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return Double.NaN; // No real root
        }
    }

    // Method to calculate the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return Double.NaN; // No real root
        }
    }

    // Main method to test the QuadraticEquation class
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2); // Example coefficients
        System.out.println("Root 1: " + equation.getRoot1());
        System.out.println("Root 2: " + equation.getRoot2());
    }
}
