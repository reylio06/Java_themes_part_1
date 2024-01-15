/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must
be printed in the exact same format as it was read from stdin, meaning that .1 is printed as 0.1, and 0.1 is printed as 0.1. If
two numbers represent numerically equivalent values (e.g., .1 = 0.1 ), then they must be listed in the same order as they were
 received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to the
instructions above.

The first line consists of a single integer, n, denoting the number of integer strings.
Each line i of the n subsequent lines contains a real number denoting the value of si.
 */

package main.java;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalExercise {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Solution
        // Sort s from index 0 to n, compare string s2 to string s1 as a BigDecimal object for descending order
        Arrays.sort(s, 0, n, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
