package com.blz.Program;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scanner.nextLine();
        System.out.println("Enter your name :" + name);
    }
}
