package com.ibs.basic.task;

import java.util.Scanner;

public class FinalTask2 {
    public static void finalTask2exec() {
//        Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
//        Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
//        Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
//        Нужно найти неизвестное.
//        Пример для теста работы программы:
//        - Ввод: x+5=7
//                - Вывод: 2
//                - Ввод: 3-x=9
//                - Вывод: -6
//                - Ввод: 3-3=x
//                - Вывод: 0
        int a, b, x = 0;
        char sign;
        String equationStr;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите уравнение из 5-ти символов типа x+5=7: ");
            equationStr = sc.nextLine();
            if (equationStr.length() != 5) {
                System.out.println("В строке не 5 символов");
                continue;
            }
            if (equationStr.charAt(1) != '+' && equationStr.charAt(1) != '-') {
                System.out.println("В строке нет знака '+' или '-'");
                continue;
            }
            sign = equationStr.charAt(1);

            if (equationStr.charAt(3) != '=') {
                System.out.println("В строке нет знака '='");
                continue;
            }
            if (equationStr.charAt(0) == 'x' && Character.isDigit(equationStr.charAt(2)) && Character.isDigit(equationStr.charAt(4))) {
                a = Integer.parseInt(String.valueOf(equationStr.charAt(2)));
                b = Integer.parseInt(String.valueOf(equationStr.charAt(4)));
                break;
            } else if (equationStr.charAt(2) == 'x' && Character.isDigit(equationStr.charAt(0)) && Character.isDigit(equationStr.charAt(4))) {
                a = Integer.parseInt(String.valueOf(equationStr.charAt(0)));
                b = Integer.parseInt(String.valueOf(equationStr.charAt(4)));
                break;
            } else if (equationStr.charAt(4) == 'x' && Character.isDigit(equationStr.charAt(0)) && Character.isDigit(equationStr.charAt(2))) {
                a = Integer.parseInt(String.valueOf(equationStr.charAt(0)));
                b = Integer.parseInt(String.valueOf(equationStr.charAt(2)));
                break;
            } else {
                System.out.println("Первым, третьим и пятым символом должны быть две цифры (от 0 до 9) и буква ‘x’ в любом порядке");
            }
        }

        if (equationStr.charAt(0) == 'x' && sign == '+') {
            x = b - a;
        } else if (equationStr.charAt(0) == 'x' && sign == '-') {
            x = a + b;
        }
        if (equationStr.charAt(2) == 'x' && sign == '+') {
            x = b - a;
        } else if (equationStr.charAt(2) == 'x' && sign == '-') {
            x = a - b;
        }
        if (equationStr.charAt(4) == 'x' && sign == '+') {
            x = a + b;
        } else if (equationStr.charAt(4) == 'x' && sign == '-') {
            x = a - b;
        }
        System.out.println("Вывод: " + x);
    }
}