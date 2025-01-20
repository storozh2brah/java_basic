package com.ibs.basic.task;

import java.util.Scanner;

public class Task8 {
    public static void task8exec() {
//      Напишите программу, где пользователь вводит любое целое положительное число n.
//      А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел: " + sum);
    }
}