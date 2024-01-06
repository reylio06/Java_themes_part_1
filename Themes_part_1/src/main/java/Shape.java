package main.java;

public abstract class Shape {

    // Attributes
    protected String color;

    // Constructor
    public Shape(String color){
        this.color = color;
    }

    // Method to calculate Area
    public abstract double calculateArea();

    // Method to print information
    @Override
    public abstract String toString();

}


