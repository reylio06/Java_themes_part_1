/*
When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the
superclass methods (as well as declare and implement new ones).

Next, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a
different, subclass-specific string

Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same
statement as the superclass' getNumberOfTeamMembers method, except that it replaces  with  (the number of players on
a Soccer team).
 */

package main.java;

import java.util.*;

public class MethodOverridingSolution {
    public static void main(String[] args) {
        MethodOverridingSports c1 = new MethodOverridingSports();
        MethodOverridingSoccer c2 = new MethodOverridingSoccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}