package com.problem.java.dsa.ooptheory;

public class Car {
    public void horn() {
        System.out.println("Horn Car");
    }    

    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        Ferrari f2 = f1;
        f1.setWheel(3);
        System.out.println(f2.getWheel());
        System.out.println(f1.getWheel());

        /**
         * it returns 3 3
         */
    }
}



