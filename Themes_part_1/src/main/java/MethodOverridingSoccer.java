package main.java;
import java.util.*;
class MethodOverridingSoccer extends MethodOverridingSports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    // Solution
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

}