package com.problem.java;

import java.util.HashSet;
import java.util.Set;;

public class OptimizedDoubleBrace {
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty HashSet
        Set<String> sets = new HashSet<String>();
 
        // Double brace
        {
            {
                // Adding elements to above HashSet
                // This is double brace initialization
                sets.add("one");
                sets.add("two");
                sets.add("three");
            }
        };
 
        // ...
        // Now pass above collection as parameter to method
        // Calling method 2 inside main() method
        useInSomeMethod(sets);
    }
 
    // Method 2
    private static void useInSomeMethod(Set<String> sets)
    {
 
        // Print elements of the desired Set
        // where method is invoked
        System.out.println(sets);
    }
}
