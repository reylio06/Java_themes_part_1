/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No otherwise.
A will consist at most 50 lower case english letters.
 */

package main.java;
import java.io.*;
import java.util.*;

public class String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversedStr = "";
        if(A.length() < 50) {
            for (int i = 0; i < A.length(); i++) {
                reversedStr = A.charAt(i) + reversedStr;
            }
            if (reversedStr.equals(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("Length is over 50 characters");
        }
    }
}