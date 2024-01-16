/*
You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class
Prime should contain a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments. You should write
the checkPrime method in such a way that the code prints only the prime numbers.

Please read the code given in the editor carefully. Also please do not use method overloading!

Note: You may get a compile time error in this problem due to the statement below:
BufferedReader br=new BufferedReader(new InputStreamReader(in));

This was added intentionally, and you have to figure out a way to get rid of the error.

Input Format

There are only five lines of input, each containing one integer.

Output Format

There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed
to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be
 printed.
 */

package main.java;
import java.io.*;
import java.util.*;

public class PrimeCheckerSolution {

    // Solution
    public static void main(String[] args) throws IOException {
        // Instantiate class PrimeChecker
        PrimeChecker prime = new PrimeChecker();

        // Read input from keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read integers from input
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());

        // Check primality
        prime.checkPrime(n1);
        prime.checkPrime(n1, n2);
        prime.checkPrime(n1, n2, n3);
        prime.checkPrime(n1, n2, n3, n4, n5);

        reader.close();
    }
}