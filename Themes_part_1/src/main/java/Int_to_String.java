/*
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the
code will print "Good job". Otherwise it will print "Wrong answer".

n can range between 100 to 100 inclusive.
 */

package main.java;

import java.util.*;

public class Int_to_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();
            in.close();

            // Solution
            if (n >= -100 && n <= 100) {
                String s = Integer.toString(n);

            // End of Solution
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
            } else {
                System.out.println("Number out of range.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}