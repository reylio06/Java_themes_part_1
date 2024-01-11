/*
There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H:
the height of the parallelogram.
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise,
print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

package main.java;
import java.io.*;
import java.util.*;

public class Static_Initializer_Block {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solution
            int breadth = scanner.nextInt();
            int height = scanner.nextInt();

            if (breadth > 0 && height > 0) {
                int area = breadth * height;
                System.out.println(area);
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
