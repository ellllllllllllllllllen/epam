package edu.epam.zavadskaya.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayService {

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static int[] shellSort(int[] array) {
        int diff = array.length / 2;
        while (diff >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int i = right - diff; i >= 0; i -= diff) {
                    if (array[i] > array[i + diff]) {
                        int temp = array[i];
                        array[i] = array[i + diff];
                        array[i + diff] = temp;
                    }
                }
            }
        }
        diff = diff / 2;
        return array;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
//4.	Получить все простые числа находящиеся в массиве.
    public static ArrayList findPrimeNumber(int[] array){
        ArrayList primeNumbers = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    primeNumbers.add(array[i]);
                }
            }
        }
        return primeNumbers;
    }
//5.	Получить все числа Фибонначчи находящиеся в массиве.
//6.	Получить все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
    private static final int FIRST_THREE_DIGIT_NUMBER = 100;
    private static final int LAST_THREE_DIGIT_NUMBER = 999;
    private static final int DIGIT = 10;

    public static ArrayList findThreeDigitNumbers(int[] array){
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= FIRST_THREE_DIGIT_NUMBER && array[i] <= LAST_THREE_DIGIT_NUMBER){
                int thirdDigit = array[i] % DIGIT;
                int secondDigit = (array[i] % (2 * DIGIT)) / DIGIT;
                int firstDigit = (array[i] % (3 * DIGIT)) / DIGIT;
                if(firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit){
                    numbers.add(array[i]);
                }
            }
        }
        return numbers;
    }
//7.	Заполнения элементов массива и с консоли, и с файла и с помощью генерации случайных чисел.
//private static Scanner scanner = new Scanner(System.in);
    public static int[] consoleFill(int size, Scanner scanner){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] randomFill(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*(200+1)) - 100;
        }
        return array;
    }

    public static int[] fillFromFile() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader x = new BufferedReader (new FileReader("D:\\array.txt"));

    }

}

