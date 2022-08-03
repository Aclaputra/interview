package com.problem.java.test;

// import java.util.Scanner;

public class TestFizzBuzzExample {
    static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            if(i%15 == 0) System.out.println("FizzBuzz");
            else if(i%5 == 0) System.out.println("Buzz");
            else if(i%3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
    public static void main(String[] args) {
        fizzBuzz(100);
    }
}
