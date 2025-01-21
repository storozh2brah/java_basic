package com.ibs.basic.task;

import java.util.Scanner;

public class Task11 {
    public static void task11exec() {
        Scanner sc = new Scanner(System.in);
//        1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        System.out.println("Введите число №1: ");
        int num1 = sc.nextInt();
        String str1 = String.valueOf(num1);
//        2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Введите число №2: ");
        int num2 = sc.nextInt();
        String str2 = String.valueOf(num2);
//        3. Сравнить 2 числа и вывести большее на экран
        int max = Math.max(num1, num2);
        System.out.println("Большее из 2х чисел: " + max);
//        4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        int min = Math.min(num1, num2);
        System.out.println("Меньшее из 2х чисел: " + (double) min);
    }
}