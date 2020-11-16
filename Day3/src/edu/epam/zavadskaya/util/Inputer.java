package edu.epam.zavadskaya.util;

import java.util.Scanner;

public class Inputer {
    private static Scanner scanner = new Scanner(System.in);

    public static int input(String message) {

        System.out.println(message);
        return scanner.nextInt();
    }
}
