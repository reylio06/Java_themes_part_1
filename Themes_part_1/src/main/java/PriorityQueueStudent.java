package main.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

// Solution
// Implement Comparable interface to compare instances of the class and to sort them
class PriorityQueueStudent implements Comparable<PriorityQueueStudent> {

    private int id;
    private String name;
    private double cgpa;

    // Constructor to initialize objects
    public PriorityQueueStudent(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    // Compare and order students by CGPA descending, name ascending and ID ascending
    @Override
    public int compareTo(PriorityQueueStudent other) {
        if (Double.compare(other.cgpa, this.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa);
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        } else {
            return Integer.compare(this.id, other.id);
        }
    }
}
