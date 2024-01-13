/*
Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The
 catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers or if y is
zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of
exceptions.

Input
10
3
Output
3

Input
10
hello
Output
java.util.InputMismatchException

Input
10
0
Output
java.lang.ArithmeticException: / by zero

Input
23.323
0
Output
java.util.InputMismatchException

 */

package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int result = x/y;
            System.out.println(result);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        scanner.close();
    }
}
