package main.java;
import java.util.Scanner;

public class ExceptionHandlingSolution {
    public static final ExceptionHandlingMyCalculator my_calculator = new ExceptionHandlingMyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
