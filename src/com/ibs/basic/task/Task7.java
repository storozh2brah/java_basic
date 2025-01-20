package com.ibs.basic.task;

import java.util.Scanner;

public class Task7 {
    public static void task7exec() {
//      1. Пользователь вводит размер массива и данные с клавиатуры в массив
        double x, y, z;
        int arraySize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x: ");
        x = sc.nextDouble();
        System.out.println("Введите y: ");
        y = sc.nextDouble();
        System.out.println("Введите z: ");
        z = sc.nextDouble();
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
//      2. Сравнить элементы массива с заранее заданными константами x, y, z.
//      3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах: " + array[i]);
            }
        }
    }
}