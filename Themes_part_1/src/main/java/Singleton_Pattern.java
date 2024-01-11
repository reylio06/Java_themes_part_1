/*
Complete the Singleton class in your editor which contains the following components:

A private Singleton non parameterized constructor.
A public String instance variable named str.
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.
You will not be handling any input in this challenge.
You will not be producing any output in this challenge.
 */

package main.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class Singleton_Pattern {
    private static Singleton_Pattern singleInstance;

    // Public instance variable named 'str'
    public String str;

    // Private constructor to prevent instantiation from outside
    private Singleton_Pattern() {
        str = "Hello, I am a Singleton!";
    }

    // Static method to get the single instance of Singleton class
    public static Singleton_Pattern getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton_Pattern();
        }
        return singleInstance;
    }
}