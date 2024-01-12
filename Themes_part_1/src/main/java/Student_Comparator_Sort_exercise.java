package main.java;

import java.util.Comparator;

// Solution
public class Student_Comparator_Sort_exercise implements Comparator<Student_Sort_exercise> {

    @Override
    public int compare(Student_Sort_exercise s1, Student_Sort_exercise s2) {
        // Compare by CGPA in decreasing order
        int cgpaComparison = Double.compare(s2.getCgpa(), s1.getCgpa());
        if (cgpaComparison != 0) {
            return cgpaComparison;
        }

        // If CGPA is the same, compare by first name in alphabetical order
        int fnameComparison = s1.getFname().compareTo(s2.getFname());
        if (fnameComparison != 0) {
            return fnameComparison;
        }

        // If first name is also the same, compare by ID in ascending order
        return Integer.compare(s1.getId(), s2.getId());
    }
}