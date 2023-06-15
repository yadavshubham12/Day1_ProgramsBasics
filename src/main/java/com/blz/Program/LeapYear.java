package com.blz.Program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the leap year");
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0)){
            System.out.println("Year is leap year");
        }
        else {
            System.out.println("Year is not leap year");
        }
        }
}
