package main.java;

class PrimeChecker {

    // Solution
    // Method to iterate through the input numbers and only print prime numbers
    void checkPrime(int... numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Check if number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}