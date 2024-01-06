package main.java;

public class Circle implements Shape{

    // Circle attributes
    private String color;
    private final double radius;

    // Circle constructor
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle Color is: " + color + " with Radius: " + radius;
    }
}
