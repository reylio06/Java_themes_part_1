package main.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegExExerciseSolution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new RegExExercise().pattern));
        }

    }
}
