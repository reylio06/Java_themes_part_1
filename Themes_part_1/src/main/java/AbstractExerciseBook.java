package main.java;
import java.util.*;

abstract class AbstractExerciseBook {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}