/*
Java's BitSet class implements a vector of bit values (i.e.: false (0) or true (1)) that grows as needed, allowing us to easily
manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is
called a set bit.

Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations.
After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new
 line

 The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M(the number of operations to perform), respectively.

 After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 as 2 space-separated integers on a new line.
 */

package main.java;
import java.util.*;
import java.util.BitSet;

public class BitSetSolution {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read Bitset B1 and B2
    int n = scanner.nextInt();// Length of BitSets B1 and B2
    // Read no of operations
    int m = scanner.nextInt(); // Number of operations

    // Create objects
    BitSet B1 = new BitSet(n);
    BitSet B2 = new BitSet(n);

    // Iterate over loops
        for (int i = 0; i < m; i++) {
        String operation = scanner.next();
        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();

        switch (operation) {
            case "AND":
                if (operand1 == 1) {
                    B1.and(B2);
                } else {
                    B2.and(B1);
                }
                break;

            case "OR":
                if (operand1 == 1) {
                    B1.or(B2);
                } else {
                    B2.or(B1);
                }
                break;

            case "XOR":
                if (operand1 == 1) {
                    B1.xor(B2);
                } else {
                    B2.xor(B1);
                }
                break;

            case "FLIP":
                if (operand1 == 1) {
                    B1.flip(operand2);
                } else {
                    B2.flip(operand2);
                }
                break;

            case "SET":
                if (operand1 == 1) {
                    B1.set(operand2);
                } else {
                    B2.set(operand2);
                }
                break;
        }

        System.out.println(B1.cardinality() + " " + B2.cardinality());
    }

        scanner.close();
}
}
