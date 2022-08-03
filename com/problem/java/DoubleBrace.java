package com.problem.java;

// Importing required classes
import java.util.HashSet;
import java.util.Set;

public class DoubleBrace {
    // Method 1
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty HashSet of string entries
        Set<String> sets = new HashSet<String>();
 
        // Adding elements to Set
        // using add() method
        sets.add("one");
        sets.add("two");
        sets.add("three");
 
        // Calling method 2 inside main() method
        // Now pass above collection as parameter to method
        useInSomeMethod(sets);
    }
 
    // Method 2
    // Helper method
    private static void useInSomeMethod(Set<String> sets)
    {
        // Print all elements of desired Set
        // where method is invoked
        System.out.println(sets);
    }
}