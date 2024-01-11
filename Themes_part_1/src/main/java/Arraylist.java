/*
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers
on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting
number of queries. Each query will consist of two integers x and y.
Each number will fit in signed integer.
Total number of integers in  lines will not cross 10^5.
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
 */
package main.java;
import java.util.*;
import java.io.*;

public class Arraylist {
    public static void main(String[] args) {
        // Solution
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Consume new line character
        scanner.nextLine();

        List<List<Integer>> arrays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            List<Integer> array = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                array.add(scanner.nextInt());
            }
            arrays.add(array);
            scanner.nextLine();
        }

        // Read number of queries
        int q = scanner.nextInt();
        scanner.nextLine();

        // Process the queries
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Check if the array x exists and has y elements
            if (x > 0 && x <= n && y > 0 && y <= arrays.get(x - 1).size()) {
                System.out.println(arrays.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
