package main.java;

public abstract class Shape {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double calculateArea();

    @Override
    public abstract String toString();

}


