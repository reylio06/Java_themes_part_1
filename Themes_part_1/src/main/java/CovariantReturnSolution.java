/*
Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a
subclass of your specified return type.

Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a return
type that is some subclass of the original return type. It is best practice to use the @Override annotation when
overriding a superclass method.
 */

package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovariantReturnSolution {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine().trim();
            CovariantReturnRegion region = null;
            switch (s) {
                case "WestBengal":
                    region = new CovariantReturnWestBengal();
                    break;
                case "AndhraPradesh":
                    region = new CovariantReturnAndrhaPradesh();
                    break;
            }
            CovariantReturnFlower flower = region.yourNationalFlower();
            System.out.println(flower.whatsYourName());
        }
    }
