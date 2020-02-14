package com.volkodav4ik;

/*
1.Есть поле из клеток посредине которого находится робот.Робот умеет выполнять 4команды:
двигаться на 1клетку в сторону:R(right),L(left),U(up),and D(down).
Задана строка из движений робота например"UUDLDR".Написать метод который
вернет true если робот вернется в ту же клетку с которой начал.
        Input:"UD"
        Output:true
        Input:"LL"
        Output:false
*/

import java.util.Scanner;

public class HW5T1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Your robot at the start of his journey.\n" +
                            "Please, enter him an order to move using this pointers: \n" +
                            "\"R\" to move right, \"L\" to move left, \n" +
                            "\"U\" to move up, \"D\" to move down");
        String way = SCANNER.nextLine();
        for (int i = 0; i < way.length(); i++) {
            if (way.charAt(i) != 'R' && way.charAt(i) != 'L' && way.charAt(i) != 'U' && way.charAt(i) != 'D') {
                throw new UnsupportedOperationException("Please use only R, L, U and D in upper case");
            }
        }
        System.out.println(resultOfMoving(way));
    }

    private static boolean resultOfMoving(String way) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < way.length(); i++) {
            if (way.charAt(i) == 'R') {
                x++;
            } else {
                if (way.charAt(i) == 'L') {
                    x--;
                } else {
                    if (way.charAt(i) == 'U') {
                        y++;
                    } else {
                        y--;
                    }
                }
            }
        }
        return (x == 0 || y == 0);
    }
}
