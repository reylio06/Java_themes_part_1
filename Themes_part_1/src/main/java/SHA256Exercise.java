/*
Cryptographic hash functions are mathematical operations run on digital data; by comparing the computed hash (i.e.,
the output produced by executing a hashing algorithm) to a known and expected hash value, a person can determine the
data's integrity. For example, computing the hash of a downloaded file and comparing the result to a previously
published hash result can show whether the download has been modified or tampered with. In addition, cryptographic
hash functions are extremely collision-resistant; in other words, it should be extremely difficult to produce the
same hash output from two different input values using a cryptographic hash function.

Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions designed by the National Security Agency
(NSA). It consists of six identical hashing algorithms (i.e., SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224,
SHA-512/256) with a variable digest size. SHA-256 is a 256-bit (32 byte) hashing algorithm which can calculate a hash code
for an input of up to 264 - 1 bits. It undergoes 64 rounds of hashing and calculates a hash code that is a 64-digit hexadecimal
number.

Given a string, s, print its SHA-256 hash value.

Input Format

A single alphanumeric string denoting .

Output Format

Print the SHA-256 encryption value of s on a new line.

Works on the same principle as MD5.
 */

package main.java;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SHA256Exercise {

        public static void main(String[] args) {

            // Solution
            // Create scanner object to read input from keyboard
            Scanner scanner = new Scanner(System.in);

            // Read the input string
            String inputString = scanner.nextLine();

            try {
                // Create an SHA256 MessageDigest instance
                MessageDigest sha256 = MessageDigest.getInstance("SHA256");

                // Update the message digest with the input string bytes
                sha256.update(inputString.getBytes());

                // Get MD5 hash value
                byte[] digest = sha256.digest();

                // Convert the byte array to hexadecimal representation
                StringBuilder sha256Hex = new StringBuilder();
                for (byte b : digest) {
                    // Format byte "b" as a two-digit zero-padded hexadecimal string
                    // %: Indicates the start of the format specifier.
                    // 0: Specifies that the result should be zero-padded.
                    // 2: Specifies the minimum width of the result. If the result is less than two digits, it will be padded with zeros.
                    // x: Specifies that the result should be formatted as a hexadecimal (base-16) number.
                    sha256Hex.append(String.format("%02x", b));
                }

                // Print the SHA256 encryption value
                System.out.println(sha256Hex.toString());

                // Use NoSuchAglorithmException to get fail instances of SHA256
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
}
