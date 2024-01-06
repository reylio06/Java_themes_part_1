package main.java;

public class Rectangle extends Shape{

    protected double length;
    protected double width;

    public Rectangle(String color, double length, double width){
        super(color);
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
