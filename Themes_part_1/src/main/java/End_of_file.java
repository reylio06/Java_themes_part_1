/*
Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty
String.
For each line, print the line number, followed by a single space, and then the line content received as input.
 */

package main.java;
import java.util.Scanner;

public class End_of_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linenumber = 1;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(linenumber + " " + line);
            linenumber++;
        }
        scanner.close();

    }
}
