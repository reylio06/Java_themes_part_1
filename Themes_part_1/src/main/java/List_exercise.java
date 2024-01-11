/*
The first line contains an integer,  N (the initial number of elements in list L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y , and the value  y must be inserted into L  at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Print the updated list L as a single line of space-separated integers.
 */

package main.java;
import java.io.*;
import java.util.*;

public class List_exercise {
    public static void main(String[] args) {
        // Solution
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            // Read the elements of list L
            L.add(scanner.nextInt());
        }

        // Read the number of queries
        int Q = scanner.nextInt();

        // Process the queries
        for (int i = 0; i < Q; i++) {
            // Read the type of query (Insert or Delete)
            String queryType = scanner.next();

            if (queryType.equals("Insert")) {
                // If is Insert type, read x and y and insert y at index x
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x, y);
            } else if (queryType.equals("Delete")) {
                // If is Delete type, read x and delete the element at index x
                int x = scanner.nextInt();
                L.remove(x);
            }

            scanner.nextLine();
        }

        // Print the updated list
        for (int element : L) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}