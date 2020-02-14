package com.volkodav4ik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2. Написать метод который проверяет число простое или нет. Если нет вывести все его делители.

public class HW5T2 {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_DENOMINATOR = 2;

    public static void main(String[] args) {

        System.out.println("Please, enter the number, what you want to check");
        int number = SCANNER.nextInt();
        if (number < 1) {
            throw new UnsupportedOperationException ("Please, use only positive number more then zero.");
        }
        isNumberSimple (number);
    }

    private static void isNumberSimple(int number) {
        List<Integer> denominators = new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0){
                denominators.add(i);
            }
        }
        if (denominators.size() <= MAX_DENOMINATOR){
            System.out.println("Number " + number + " is simple");
        } else {
            System.out.println("Number " + number + " isn't simple, its denominators are: " + denominators.toString());
        }
    }
}
