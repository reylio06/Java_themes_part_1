/*
n computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data
type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back
(tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For
example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();

In this problem, you are given N integers. You need to find the maximum number of unique integers among all the
possible contiguous subarrays of size M.

Note: Time limit is 3 second for this problem.
 */
package main.java;
import java.util.*;

public class DequeueExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Solution
        // Deque for sliding window
        Deque<Integer> deque = new ArrayDeque<>();
        // Set for keeping unique integers from current window
        Set<Integer> uniqueSet = new HashSet<>();
        // End of solution

        int n = in.nextInt();
        int m = in.nextInt();
        // Solution
        // Store max number of unique integers
        int maxUnique = 0;
        // End of solution

        // Loop through integer array
        for (int i = 0; i < n; i++) {
            // Read next integer from input
            int num = in.nextInt();
            // Add the current element to the deque and set
            deque.addLast(num);
            uniqueSet.add(num);

            // Keep sliding window of size M
            if (deque.size() == m + 1) {
                // If deque size > M, remove element from left side
                int removed = deque.removeFirst();
                // Check if removed element is still in the remaining window
                if (!deque.contains(removed)) {
                    // If the removed element is not present in the remaining window, remove from the set
                    uniqueSet.remove(removed);
                }
            }

            // Update the maximum number of unique integers
            maxUnique = Math.max(maxUnique, uniqueSet.size());
        }

        // Print max number of unique integers
        System.out.println(maxUnique);
    }
}