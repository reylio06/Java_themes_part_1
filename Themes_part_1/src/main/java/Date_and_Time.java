/*
You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your
 task, we have provided a portion of the code in the editor.
 */

package main.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;

public class Date_and_Time {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    // Solution
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);

        String dayofweek = date.getDayOfWeek().name();
        
        return dayofweek.toUpperCase();

    }
}