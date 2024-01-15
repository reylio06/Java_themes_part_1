/*
In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that
it prints all the methods of another class called Student in alphabetical order. We will append your code with the
Student class before running it.
You have to print all the methods of the student class in alphabetical order
 */

package main.java;

import java.lang.reflect.*;
import java.util.*;

public class ReflexionAttributesSolution {
    public static void main(String[] args) {
        // Solution
        // Obtain the class object for Student class
        Class student = Student.class;

        // Get all methods of the Student class
        Method[] methods = student.getDeclaredMethods();

        // Store methods in an array
        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }

        // Sort
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}