/*
In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of
elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the
last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B
are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till
end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true

 */

package main.java;

import java.util.*;

class StackExercise {
    public static boolean isBalanced(String expression) {
        // Initialize a new Stack
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // If condition is fulfilled, push onto the stack
                stack.push(ch);
                // Checks if the character is a closing parenthesis.
                // If condition is fulfilled, checks if the stack is not empty and if the top of the stack contains
                // the corresponding opening parenthesis. If both conditions are met, pops the opening
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                // Unmatched closing parenthesis or invalid character
                return false;
            }
        }
        // The stack should be empty if the parenthesis are paired
        return stack.isEmpty();
    }

    public static void main(String[] argh) {
        // Create new Scanner object to handle the reading from keyboard
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }

        sc.close();
    }
}