package main.java;

class AnnotationFamilyMember {
        // Solution
        // Add annotation for Senior role and budget limit
        @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
        // End of solution
        public void seniorMember(int budget, int moneySpend) {
            System.out.println("Senior Member");
            System.out.println("Spend: " + moneySpend);
            System.out.println("Budget Left: " + (budget - moneySpend));
        }

        // Solution
        // Add annotation for Junior role and budget limit
        @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
        // End of solution
        public void juniorUser(int budget, int moneySpend) {
            System.out.println("Junior Member");
            System.out.println("Spend: " + moneySpend);
            System.out.println("Budget Left: " + (budget - moneySpend));
        }
    }