/*
 In this challenge, you must read 3 integers from stdin and then print them to stdout.
 Each integer must be printed on a new line. To make the problem a little easier,
 a portion of the code is provided for you in the editor below.
*/

package main.java;
import java.util.*;

public class Stdin_stdout_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Solution
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        // Solution
        System.out.println(b);
        System.out.println(c);
    }
}
