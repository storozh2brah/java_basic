package com.ibs.basic.task;

import java.util.Scanner;

public class Task4 {
    public static void task4exec() {
//      1. Ввести три числа с клавиатуры x, y, z
        double x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x: ");
        x = sc.nextDouble();
        System.out.println("Введите y: ");
        y = sc.nextDouble();
        System.out.println("Введите z: ");
        z = sc.nextDouble();
//      2. Найти и вывести в консоль среднее арифметическое этих чисел
        double average;
        average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + average);
//      3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double roundedAverage = Math.floor(average / 2);
        System.out.println("Среднее арифметическое округленное: " + roundedAverage);
//      4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (roundedAverage > 3) System.out.println("Программа выполнена корректно");
    }
}