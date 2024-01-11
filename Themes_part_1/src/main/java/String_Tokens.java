/*
Input
A single string, s.
Output
On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
Next, print each of the n tokens on a new line in the same order as they appear in input string s.
 */

package main.java;
import java.io.*;
import java.util.*;

public class String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Solution
        String[] tokens = s.split("[\\s!,?._'@]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
        // End of solution
        scan.close();
    }
}
