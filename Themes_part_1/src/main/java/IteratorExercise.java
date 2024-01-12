/*
In this problem you need to complete a method func. The method takes an ArrayList as input. In that ArrayList there
is one or more integer numbers, then there is a special string "###", after that there are one or more other strings.
 */

package main.java;

import java.util.*;

public class IteratorExercise {
    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {

            // Solution
            Object element = it.next();
            if (element instanceof String && "###".equals((String) element))//Hints: use instanceof operator
            // End of solution
            break;
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
