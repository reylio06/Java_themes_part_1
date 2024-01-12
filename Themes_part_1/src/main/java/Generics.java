/*
Let's say you have an integer array and a string array. You have to write a single method printArray that can print
all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 */

package main.java;
import java.io.*;
import java.util.*;

public class Generics {
    // Solution
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}