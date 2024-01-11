/* In the first line, there will be an integer T denoting number of pairs.
Each of the next T lines will contain two strings seperated by a single space.
Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.*/

package main.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hashsets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // Solution

        // HashSet used to store unique pairs
        Set<String> uniquePairs = new HashSet<>();

        // Process each pair and print the number of unique pairs
        for (int i = 0; i < t; i++) {
            String combinedPair = pair_left[i] + " " + pair_right[i];
            uniquePairs.add(combinedPair);
            System.out.println(uniquePairs.size());
        }

    }
}
