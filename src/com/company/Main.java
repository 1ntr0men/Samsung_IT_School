package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (y >= 0 && y <= 0,5 && x >= 0 && y >= Math.sin(Math.toRadians(x))){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
