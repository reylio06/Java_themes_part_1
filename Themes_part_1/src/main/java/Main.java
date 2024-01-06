package main.java;
public class Main {
    public static void main(String[] args) {
        Circle mycircle = new Circle("Blue", 5.0);
        Rectangle myrectangle = new Rectangle("Yellow", 15, 10);
        Triangle mytriangle = new Triangle("Red", 3, 4, 5);

        System.out.println("Circle area is: " + mycircle.calculateArea());
        System.out.println("Circle string is: " + mycircle);
        System.out.println("Rectangle area is: " + myrectangle.calculateArea());
        System.out.println("Rectangle string is: " + myrectangle);
        System.out.println("Triangle area is: " + mytriangle.calculateArea());
        System.out.println("Triangle string is: " + mytriangle);
    }
}