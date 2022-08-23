package com.problem.java.test;

public class TestOperators {
    public static void main(String[] args) {
        System.out.println(1 << 0);
        System.out.println(1 << 1);
        System.out.println(1 << 2);

        // result is 4. 2 power 2 (2 x 2).
        System.out.println(2 << 1);
        // result is 8. 2 power 3 (2 x 2 x 2).
        System.out.println(2 << 2);
        // result is 16. 2 power 4 (2 x 2 x 2 x 2).
        System.out.println(2 << 3);

        // still mystery. 3 + 3 power 2.
        System.out.println(3 << 2);

        int checker = 10;
        /**
         * it just like += in javascript.
         * it can written like |= this too in java.
         */
        System.out.println(checker |= 4);
    }

}
