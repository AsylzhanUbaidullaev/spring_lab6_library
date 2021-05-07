package com.asylzhan.spring;

import java.util.Scanner;

public class LMS {
    Scanner in = new Scanner(System.in);

    public void runLMS() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("=== Library Management System ===");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("0. Exit");

            choice = in.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        }
    }
}
