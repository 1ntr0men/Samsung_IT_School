package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a > 0 && a < 1000 && a % 5 == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
