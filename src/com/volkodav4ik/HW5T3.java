package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
3*. Написать метод. Входящие параметры: отсортированный массив и число.
Метод должен вернуть true если это число есть в массиве, используя бинарный поиск.
*/

public class HW5T3 {
    private static final Random RANDOM = new Random();
    private static final int ARR_SIZE = 100;
    private static final int MAX_VALUE = 999;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[ARR_SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_VALUE);
        }
        System.out.print("Enter number: ");
        int number = SCANNER.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Result of searching: " + isNumberInArray(arr, number));

    }

    private static boolean isNumberInArray(int[] arr, int number) {
        int lowestIndex = 0;
        int higherIndex = arr.length - 1;
        int middle = (higherIndex + lowestIndex) / 2;
        while (arr[middle] != number && lowestIndex <= higherIndex) {
            if (arr[middle] > number) {
                higherIndex = middle - 1;
            } else {
                lowestIndex = middle + 1;
            }
            middle = (higherIndex + lowestIndex) / 2;
        }
        return lowestIndex <= higherIndex;
    }
}
