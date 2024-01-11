/*
The first line of input contains an integer n, describing the total number of usernames. Each of the next n lines
contains a string describing the username. The locked stub code reads the inputs and validates the username.
For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a
new line.
 */

package main.java;

public class Valid_Username_Regular_Expression {
    // Solution
    //^: Asserts the start of the string.
    //[a-zA-Z]: Matches any single uppercase or lowercase letter.
    //[a-zA-Z0-9_]: Matches any single uppercase or lowercase letter, digit, or underscore.
    //{7,29}: Specifies a quantifier that matches between 7 and 29 occurrences of the preceding pattern.
    //$: Asserts the end of the string.
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
