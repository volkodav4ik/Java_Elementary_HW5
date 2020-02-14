package com.volkodav4ik;

/*
4*. Написать рекурсивный(!!!) метод который выводит все перестановки строки.
Например для строки abc: abc, acb, bac, bca, cab, cba
*/
public class HW5T4 {
    public static void main(String args[]) {
        String s = "asdf";
        printPermutations("", s);
    }

    public static void printPermutations(String beginningString, String endingString) {
        if (endingString.length() <= 1) {
            System.out.print(beginningString + endingString + " ");
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                printPermutations(beginningString + endingString.charAt(i), newString);
            }
        }
    }
}
