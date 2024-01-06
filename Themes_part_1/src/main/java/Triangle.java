package main.java;

public class Triangle implements Shape {

    // Triangle attributes
    private String color;
    protected double side_value1;
    protected double side_value2;
    protected double side_value3;

    // Triangle constructor
    public Triangle(String color, double side_value1, double side_value2, double side_value3){
        this.color = color;
        this.side_value1 = side_value1;
        this.side_value2 = side_value2;
        this.side_value3 = side_value3;
    }

    @Override
    public double calculateArea() {
        double semiperimeter = (side_value1 + side_value2 + side_value3)/2;
        System.out.println("The semiperimeter is: " + semiperimeter);
        return Math.sqrt((semiperimeter * (semiperimeter - side_value1) * (semiperimeter - side_value2) * (semiperimeter - side_value3)));
    }

    @Override
    public String toString() {
        return "Triangle color is: " + color + " and the side values are: " + " side_value1: " + side_value1 + " side_value2: " + side_value2 + " side_value3: " + side_value3;
    }
}
