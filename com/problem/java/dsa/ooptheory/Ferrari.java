package com.problem.java.dsa.ooptheory;

public class Ferrari extends Car {
    private int wheel = 4;

    public void horn() {
        System.out.println("Ferrarrriiiii");
    }

    /**
     * Getter method for property wheel.
     * 
     * @return property value of wheel
     */
    public int getWheel() {
        return wheel;
    }
    /**
     * Setter method for property wheel.
     * 
     * @param wheel value to be assigned to property wheel
     */
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}