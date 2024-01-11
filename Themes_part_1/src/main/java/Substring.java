/*
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.
 */

package main.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        // Solution
        int start = in.nextInt();
        int end = in.nextInt();

        String substring = S.substring(start, end);
        System.out.println(substring);
    }
}
