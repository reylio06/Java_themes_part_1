package main.java;
import java.util.*;

public class Solution_Sort_exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student_Sort_exercise> studentList = new ArrayList<Student_Sort_exercise>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student_Sort_exercise st = new Student_Sort_exercise(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Sort the studentList using the StudentComparator
        Collections.sort(studentList, new Student_Comparator_Sort_exercise());

        // Print the first names after sorting
        for (Student_Sort_exercise st : studentList) {
            System.out.println(st.getFname());
        }
    }
}