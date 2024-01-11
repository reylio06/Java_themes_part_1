/*
The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.
There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space
 */

package main.java;
import java.io.*;
import java.util.*;

public class Strings_Introduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        // Solution
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        String result = (A.compareTo(B) > 0) ? "Yes" : "No";
        System.out.println(result);

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        sc.close();

    }
}

