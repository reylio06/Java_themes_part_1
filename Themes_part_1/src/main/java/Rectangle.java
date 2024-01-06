package main.java;

public class Rectangle implements Shape{

    // Rectangle attributes
    private String color;
    private double length;
    private double width;

    // Rectangle constructor
    public Rectangle(String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle Color is: " + color + " with length: " + length + " and with width: " + width;
    }
}
