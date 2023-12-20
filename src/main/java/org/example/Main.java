package org.example;
public class Main {
    public static void main(String[] args) {
        int option = 2;

        if (option == 1) {
            int n = 6;
            long factorial = calculateFactorial(n);
            System.out.println("Факторіал " + n + " = " + factorial);
        } else if (option == 2) {
            int n = 10;
            long sum = calculateSumOfPrimes(n);
            System.out.println("Сума простих чисел до " + n + " = " + sum);
        } else {
            System.out.println("Недійсна опція.");
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long calculateSumOfPrimes(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}