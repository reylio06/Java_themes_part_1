/*
The first line of input contains an integer N, denoting the number of test cases. The next N lines contain a string of
any printable characters representing the pattern of a regex.
 For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not
 print the quotes.
 */

package main.java;

import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            // Solution
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
        }
        // End of solution
        in.close();
        }
}
