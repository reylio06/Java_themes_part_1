/*
You are given a 6 x 6 2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
There will be exactly 6 lines, each containing 6 integers separated by spaces. Each integer will be between -9 and 9 inclusive.
Print the answer to this problem on a single line.
 */

package main.java;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TwoD_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        //Solution
        int maxHourglassSum = Integer.MIN_VALUE;

        // Iterate over possible hourglasses
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int hourglassSum = calculateHourglassSum(arr, i, j);
                maxHourglassSum = Math.max(maxHourglassSum, hourglassSum);
            }
        }

        System.out.println(maxHourglassSum);
    }

    private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        int sum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                + arr.get(row + 1).get(col + 1)
                + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);

        return sum;
    }
}

