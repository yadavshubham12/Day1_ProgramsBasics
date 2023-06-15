package com.blz.Program;

public class Integers {
    public static void main(String[] values) {
        int sum = 0;
        System.out.println("Calculates sum of Integers");
        for (int i=0; i<values.length; i++){
            System.out.println(values[i]);
            sum = sum + Integer.parseInt(values[i]);
        }
        System.out.println("Sum :" +sum);
    }
}
