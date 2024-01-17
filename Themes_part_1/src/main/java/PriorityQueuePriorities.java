package main.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

// Solution
class PriorityQueuePriorities {

    // Method to get list of students in priority order
    public List<PriorityQueueStudent> getStudents(List<String> events) {

        // Create priority queue to store instances of PriorityQueueStudent
        PriorityQueue<PriorityQueueStudent> pq = new PriorityQueue<>();

        // Iterate through each event
        for (String event : events) {
            String[] parts = event.split(" ");
            // Process ENTER event - extract student name, CGPA and ID
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                // Add student to priority queue
                pq.offer(new PriorityQueueStudent(id, name, cgpa));

                // Process SERVED event - student with the highest priority is removed from queue
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        // After all events are processed, get students left in the queue in the order of priority and add them to list
        List<PriorityQueueStudent> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        // Return list of remaining students
        return result;
    }
}
