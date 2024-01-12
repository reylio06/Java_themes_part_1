/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to
their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in
 alphabetical order. If those two students also have the same first name, then order them according to their ID. No
 two students have the same ID.
You can use comparators to sort a list of objects.
The first line of input contains an integer N, representing the total number of students. The next N lines contains a
 list of student information in the following structure:

Constraints:
2 <= N <= 1000
0 <= ID <= 100 000
5 <= Name <= 30
0 <= CGPA <= 4.00

The name contains only lowercase English letters. The ID contains only integer numbers without leading zeros. The
CGPA will contain, at most, 2 digits after the decimal point.
After rearranging the students according to the above rules, print the first name of each student on a separate line.
 */

package main.java;
import java.util.*;

public class Student_Sort_exercise {
    private int id;
    private String fname;
    private double cgpa;
    public Student_Sort_exercise(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
