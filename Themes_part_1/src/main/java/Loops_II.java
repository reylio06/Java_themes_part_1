/*
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
 */

package main.java;
import java.util.*;
import java.io.*;

public class Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // Solution
            printSeries(a, b, n);
        }
        in.close();
    }

    // Solution
    private static void printSeries(int a, int b, int n) {
        int result = a;

        for (int j = 0; j < n; j++) {
            // Calculate each term in the series
            result += Math.pow(2, j) * b;
            System.out.print(result + " ");
        }

        System.out.println();
    }
}
