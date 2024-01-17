/*
Here, we partially define an annotation, FamilyBudget and a class, FamilyMember. In this problem, we give the user role and the amount of
money that a user spends as inputs. Based on the user role, you have to call the appropriate method in the FamilyMember class. If
 the amount of money spent is over the budget limit for that user role, it prints Budget Limit Over.

Your task is to complete the FamilyBudget annotation and the FamilyMember class so that the Solution class works perfectly with the defined constraints.

Note: You must complete the 5 incomplete lines in the editor. You are not allowed to change, delete or modify any
other lines. To restore the original code, click on the top-left button on the editor and create a new buffer.

Sample Input

3
SENIOR 75
JUNIOR 45
SENIOR 40

Sample Output

Senior Member
Spend: 75
Budget Left: 25
Junior Member
Spend: 45
Budget Left: 5
Senior Member
Spend: 40
Budget Left: 60
 */

package main.java;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AnnotationExerciseSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class annotatedClass = AnnotationFamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        // Solution
                        // Take budgetlimit from @AnnotationFamilyBudget annotation
                        // Check if budget limit is modified correctly
                        int budgetLimit = family.budgetLimit();
                        if (userRole.equals(role)) {
                            // End of solution
                            if (spend <= budgetLimit) {
                                method.invoke(AnnotationFamilyMember.class.newInstance(), budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}