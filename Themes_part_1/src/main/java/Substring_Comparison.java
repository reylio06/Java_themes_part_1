/*
Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find

Returns string: the string ' + "\n" + ' where and are the two substrings
 */

package main.java;
import java.util.Scanner;

public class Substring_Comparison {
    public static String getSmallestAndLargest(String s, int k) {
        // Solution
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            // Compare with smallest
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            // Compare with largest
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }
    // End of solution

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
