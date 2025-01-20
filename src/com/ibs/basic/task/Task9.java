package com.ibs.basic.task;

import java.util.Scanner;

public class Task9 {
    public static void task9exec() {
//      1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        int arraySize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        while (true) {
            arraySize = sc.nextInt();
            if (arraySize != 0) break;
        }
        double[] array = new double[arraySize];
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextDouble();
        }
//      2. Посчитайте среднее арифметическое элементов массива.
        double average = 0;
        for (int i = 0; i < arraySize; i++) {
            average += array[i];
        }
        average /= arraySize;
        System.out.println("Среднее арифметическое: " + average);
//      3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i] + " * " + average + " = " + array[i] * average);
        }
    }
}