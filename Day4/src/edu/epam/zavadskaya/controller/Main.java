package edu.epam.zavadskaya.controller;

import edu.epam.zavadskaya.service.ArrayService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //int[] array = {2, 5, 1, 3, 4};

//        for (int i = 0; i < ArrayService.bubbleSort(array).length; i++) {
//            System.out.println(array[i]);
//        }

        System.out.println("Input numbers: ");
        int[] array = ArrayService.consoleFill(5, scanner);

        for (int i = 0; i < 5; i++) {
            System.out.print(" " + array[i]);

        }

    }
}
