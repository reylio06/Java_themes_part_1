package main.java;

public class MethodOverridingSuperMotorCycle extends MethodOverridingSuperBiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MethodOverridingSuperMotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        // Solution
        String temp= super.define_me();

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
