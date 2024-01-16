/*
Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where 0 <= i < n), you
can perform one of the following moves:

Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
Move Forward:
If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap contains a zero, you can jump to cell i+leap.
If you're standing in cell n-1 or the value of i + leap => n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a 0.
If the destination index is greater than n-1, you win the game.

The first line contains an integer, q, denoting the number of queries (i.e., function calls).
The 2*q subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of n and leap.
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of game0, game1, ..., gamen-1.

Test against:
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
 */

package main.java;
import java.util.*;

public class OneDArrayII {

    // Solution
    public static boolean canWin(int leap, int[] game) {
        // Create set to keep track of visited positions
        Set<Integer> visited = new HashSet<>();
        return canWinHelper(leap, game, 0, visited);
    }

    //
    private static boolean canWinHelper(int leap, int[] game, int current, Set<Integer> visited) {
        // Condition to check if position is out of the map, has been visited already or contains another piece (value 1)
        if (current < 0 || current >= game.length || visited.contains(current) || game[current] == 1) {
            return false;
        }

        // Add current position to visited set
        visited.add(current);

        // Condition to check if player has finished game or can make move to win
        if (current == game.length - 1 || current + leap >= game.length) {
            return true;
        }

        // Perform move forward, backward or leap
        return canWinHelper(leap, game, current + 1, visited) ||
                canWinHelper(leap, game, current - 1, visited) ||
                canWinHelper(leap, game, current + leap, visited);
    }

    // End of solution

    public static void main(String[] args) {
        // Read number of queries
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {

            // Read query size and leap distance
            int n = scan.nextInt();
            int leap = scan.nextInt();

            // Create array of size "n"
            int[] game = new int[n];

            // Read values of array elements from input
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            // Check if player can win
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
