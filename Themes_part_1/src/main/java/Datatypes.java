/*
The first line contains an integer, T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.
For each input variable n and appropriate primitive dataType, you must determine if the given primitives are capable of
storing it. If yes, then print:
 */

package main.java;
import java.util.*;
import java.io.*;

public class Datatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            try {
                // Solution
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}