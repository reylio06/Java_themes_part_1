/*
There will be two lines containing two numbers, a and b.
a and b are non-negative integers and can have maximum 200 digits.
Output two lines. The first line should contain a + b, and the second line should contain a * b. Don't print any leading zeros.
 */

package main.java;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Big_Integer {
    public static void main(String[] args) {
        // Solution
        Scanner scanner = new Scanner(System.in);

        BigInteger numberA = scanner.nextBigInteger();
        BigInteger numberB = scanner.nextBigInteger();

        BigInteger sum = numberA.add(numberB);
        BigInteger product = numberA.multiply(numberB);

        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }
}
