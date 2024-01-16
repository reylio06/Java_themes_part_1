package main.java;
import java.util.Comparator;

// Solution
class ComparatorChecker implements Comparator<ComparatorPlayer> {

    public int compare(ComparatorPlayer a, ComparatorPlayer b) {
        if (a.score != b.score) {
            // If scores are different, sort in descending order by score
            return Integer.compare(b.score, a.score);
        } else {
            // If scores are equal, sort alphabetically by name
            return a.name.compareTo(b.name);
        }
    }
}