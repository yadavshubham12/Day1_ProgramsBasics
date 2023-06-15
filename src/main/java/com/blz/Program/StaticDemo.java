package com.blz.Program;

import java.util.Stack;

public class StaticDemo {

    static int num = 10;


    static void displaynum(){
        System.out.println("Count :" +num);
    }
    public static void main(String[] args) {
        displaynum();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        displaynum();
    }
    static {
        System.out.println("Static block executed");
        num++;
    }
}
