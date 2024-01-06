package main.java;
public class Main {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();

        int firsttry = mycalculator.multiply(5,6,7);
        double secondtry = mycalculator.multiply(5.5, 6.6, 7.7);

        System.out.println("Result 1 is: " + firsttry);
        System.out.println("Result 2 is: " + secondtry);
    }
}