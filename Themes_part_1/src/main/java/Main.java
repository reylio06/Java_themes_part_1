package main.java;
public class Main {
    public static void main(String[] args) {
        Circle mycircle = new Circle("Blue", 5.0);
        Rectangle myrectangle = new Rectangle("Yellow", 15, 10);

        System.out.println("Circle area is: " + mycircle.calculateArea());
        System.out.println("Circle string is: " + mycircle.toString());
        System.out.println("Rectangle area is: " + myrectangle.calculateArea());
        System.out.println("Rectangle string is: " + myrectangle.toString());

    }
}