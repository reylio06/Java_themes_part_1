/*
The first line contains a single integer,n, denoting the length of array A = [a0, a1, ..., an-1].
The second line contains n space-separated integers describing each respective element, ai, in array A.
Print the number of subarrays of A having negative sums.
 */
package main.java;
import java.io.*;
import java.util.*;

public class Subarray {
    public static void main(String[] args) {
        // Solution
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int countNegativeSubarrays = countNegativeSubarrays(A);
        System.out.println(countNegativeSubarrays);

        scanner.close();
    }

    private static int countNegativeSubarrays(int[] arr) {
        int count = 0;

        // Iterate through all subarrays
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            // Calculate the sum of the current subarray
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                // If the sum is negative, increment the count
                if (currentSum < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}