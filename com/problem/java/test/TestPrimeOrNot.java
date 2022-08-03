package com.problem.java.test;

public class TestPrimeOrNot {
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if(isPrime(11)) System.out.println("True");
        else System.out.println("False");
        if(isPrime(15)) System.out.println("True");
        else System.out.println("False");
    }
}
