/*
MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value. Here are some
common uses for MD5:

To store a one-way hash of a password.
To provide some assurance that a transferred file has arrived intact.
MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, 1994); however,
the security of MD5 has been severely compromised, most infamously by the Flame malware in 2012. The CMU Software
Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".

Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.

Input Format

A single alphanumeric string denoting s.

Output Format

Print the MD5 encryption value of s on a new line.
 */
package main.java;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class MD5Exercise {
    public static void main(String[] args) {

        // Solution
        // Create scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        try {
            // Create an MD5 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update the message digest with the input string bytes
            md.update(inputString.getBytes());

            // Get MD5 hash value
            byte[] digest = md.digest();

            // Convert the byte array to hexadecimal representation
            StringBuilder md5Hex = new StringBuilder();
            for (byte b : digest) {
                // Format byte "b" as a two-digit zero-padded hexadecimal string
                // %: Indicates the start of the format specifier.
                // 0: Specifies that the result should be zero-padded.
                // 2: Specifies the minimum width of the result. If the result is less than two digits, it will be padded with zeros.
                // x: Specifies that the result should be formatted as a hexadecimal (base-16) number.
                md5Hex.append(String.format("%02x", b));
            }

            // Print the MD5 encryption value
            System.out.println(md5Hex.toString());

            // Use NoSuchAglorithmException to get fail instances of MD5
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
