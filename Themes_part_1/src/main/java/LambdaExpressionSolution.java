/*
Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is
 not.

The first line contains an integer, T (the number of test cases).

The T subsequent lines each describe a test case in the form of 2 space-separated integers:
The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, or 3 for Palindrome). The second
integer denotes the number to be checked.
 */
package main.java;

import java.io.*;
import java.util.*;


public class LambdaExpressionSolution {
    public static void main(String[] args) throws IOException {
        LambdaExpressionMyMath ob = new LambdaExpressionMyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        LambdaExpressionPerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

