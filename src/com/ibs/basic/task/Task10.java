package com.ibs.basic.task;

import java.util.Scanner;

public class Task10 {
    public static void task10exec() {
//      Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
//      а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
//      Размерность матрицы задается пользователем.
        int matrixSize1, matrixSize2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы - строки: ");
        while (true) {
            matrixSize1 = sc.nextInt();
            if (matrixSize1 != 0) break;
        }
        System.out.println("Введите размер матрицы - столбцы: ");
        while (true) {
            matrixSize2 = sc.nextInt();
            if (matrixSize2 != 0) break;
        }
        double[][] matrixArray = new double[matrixSize1][matrixSize2];
        System.out.println("Заполните матрицу числами: ");
        for (int i = 0; i < matrixSize1; i++) {
            for (int j = 0; j < matrixSize2; j++) {
                matrixArray[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Первая строка матрицы * 3: ");
        for (int i = 0; i < matrixSize1; i++) {
            for (int j = 0; j < matrixSize2; j++) {
                if (i == 0) {
                    System.out.println("Cтрока " + (i + 1) + " Столбец " + (j + 1) + ": " + matrixArray[i][j] + " * 3 = " + matrixArray[i][j] * 3);
                }
            }
        }
    }
}