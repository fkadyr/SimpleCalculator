package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Addition = "+addition(a, b));
        System.out.println("Deduction = "+deduction(a, b));
        System.out.println("Multiplication = "+multiplication(a, b));
        System.out.println("Division = "+division(a, b));
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int deduction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }
}