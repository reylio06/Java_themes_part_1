package main.java;

class LambdaExpressionMyMath {
    public static boolean checker(LambdaExpressionPerformOperation p, int num) {
        return p.check(num);
    }
    // Solution
    // Implement LambdaExpressionPerform Operation interface
        public LambdaExpressionPerformOperation isOdd() {
            // Check if number is odd
            return num -> num % 2 != 0;
        }

        public LambdaExpressionPerformOperation isPrime() {
            // Check if number is prime
            return num -> {
                if (num < 2) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            };
        }

        public LambdaExpressionPerformOperation isPalindrome() {
            // Check if number is a palindrome
            // For this number must be converted to String
            // The original and reversed strings are compared to check palindrome condition
            return num -> {
                String strNum = Integer.toString(num);
                String reversed = new StringBuilder(strNum).reverse().toString();
                return strNum.equals(reversed);
            };
        }
        // End of solution
    }
