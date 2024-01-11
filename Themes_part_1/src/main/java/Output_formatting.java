/*
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0
to 999.
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits;
if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */

package main.java;

import java.util.Scanner;

public class Output_formatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            //Solution
            // %15s: This format specifier in "%-15s" ensures that the string (s1) is left-justified and has a width
            // of 15 characters.
            // %03d: This format specifier in "%03d" ensures that the integer (x) is printed with leading zeros to
            // make it three digits wide.
            // The %n in a format string is a platform-independent newline character. When used in a format string
            // within the printf method, %n represents the newline character sequence appropriate for the platform.
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
