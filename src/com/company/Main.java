package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("number: ");
        Integer number = scanner.nextInt();
        String numStr = number.toString();

        System.out.println("This number is a string: " + numStr);
    }
}
