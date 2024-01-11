/*
A single line containing an integer, n (the number to be checked).
n contains at most 100 digits.
If n is a prime number, print prime; otherwise, print not prime
 */

package main.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Primality_Test {
    // Solution
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String nstr = bufferedReader.readLine();
        // Solution
        if(nstr.length() <= 100) {
            int n = Integer.parseInt(nstr);
            if (isPrime(n)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        else {
            System.out.println("Length is overrun");
        }
        // End of solution
        bufferedReader.close();
    }
}
