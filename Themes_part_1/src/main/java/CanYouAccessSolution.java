/*
You are given a class Solution and an inner class Inner.Private. The main method of class Solution takes an integer
num as input. The powerof2 in class Inner.Private checks whether a number is a power of 2. You have to call the method
powerof2 of the class Inner.Private from the main method of the class Solution.

Sample Input

8
Sample Output

8 is power of 2
An instance of class: Solution.Inner.Private has been created
 */

package main.java;
import java.io.*;
import java.lang.reflect.*;


public class CanYouAccessSolution {
    public static void main(String[] args) throws Exception {
        CanYouAccessDoNotTerminate.forbidExit();

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            // Solution
            // Reflection used to access the private inner class
            // Class<?> is a generic type that represents the class of an object
            Class<?> innerClass = Inner.Private.class;
            // Get constructor of private inner class
            Constructor<?> constructor = innerClass.getDeclaredConstructor(Inner.class);
            // Override the default access restrictions
            constructor.setAccessible(true);
            // Create instance of private inner class which is passed to the constructor
            o = constructor.newInstance(new Inner());

            // Calling the method powerof2 from the private inner class
            Method powerof2Method = innerClass.getDeclaredMethod("powerof2", int.class);
            // Override the default access restrictions
            powerof2Method.setAccessible(true);
            // Invoke powerof2 method on the instance of "o" with num as argument
            String result = (String) powerof2Method.invoke(o, num);

            // Print result
            System.out.println(num + " is " + result);
            // End of Solution

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (CanYouAccessDoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution


