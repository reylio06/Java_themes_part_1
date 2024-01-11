/*
Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string

Returns boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
 */

package main.java;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Solution
        if (a.length() != b.length()) {
            return false;
        }
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Convert strings to character arrays
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        // Sort character arrays
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        // Compare sorted arrays
        return Arrays.equals(charArrayA, charArrayB);
    }
        // End of solution

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

