/*

In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance
of a class called MyBook. Your task is to write just the MyBook class.
 */
package main.java;

import java.util.*;

public class AbstractExerciseSolution {
    public static void main(String[] args) {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        AbstractExerciseMyBook new_novel = new AbstractExerciseMyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}
