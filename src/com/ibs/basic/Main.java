package com.ibs.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      task_1
        System.out.println("Hello World!");

//      task_2
//      1. Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей произвольное дробное значение
        double maxFloatValue = 3.14;
//      2. Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте ей наибольшее возможное значение
        byte minIntValue = Byte.MAX_VALUE;

//      task_3
//      1. Задайте массив из 5 любых целых чисел
        int[] myArray = {1, 2, 3, 4, 5};
//      2. Поменяйте местами первый и последний элемент в массиве
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = temp;
//      3. Вывести в консоль результат суммы первого и среднего элемента
        System.out.println(myArray[0] + myArray[myArray.length / 2]);

//      task_4
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
//      task_5
//      1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        double num1, num2, operation = 0;
        char symbol;
        System.out.println("Введите num1: ");
        num1 = sc.nextDouble();
        System.out.println("Введите num2: ");
        num2 = sc.nextDouble();
        while (true) {
            System.out.println("Введите знак операции: ");
            symbol = sc.next().charAt(0);
            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') break;
            else System.out.println("Разрешены только: ‘+’, ‘-’, ‘*’ или ‘/’");
        }
        switch (symbol) {
            case '+':
                operation = num1 + num2;
                break;
            case '-':
                operation = num1 - num2;
                break;
            case '*':
                operation = num1 * num2;
                break;
            case '/':
                operation = num1 / num2;
                break;
        }
//      2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        System.out.println("num1 " + symbol + " num2 = " + operation);
//      task_6
//      Напишите программу конвертер физических величин:
//      1. Пользователю предлагается на выбор ввести массу или расстояние:
        int choice, measureChoice = 0;
        double amount;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        while (true) {
            choice = sc.nextInt();
            if (choice == 1 || choice == 2) break;
            else System.out.println("Введите 1 или 2");
        }
//      2. Пользователю предлагается выбрать единицу измерения.
        switch (choice) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограммы; 2 - фунты;");
                while (true) {
                    measureChoice = sc.nextInt();
                    if (measureChoice == 1 || measureChoice == 2) break;
                    else System.out.println("Введите 1, 2 или 3");
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метры; 2- мили; 3 - ярды; 4- футы");
                while (true) {
                    measureChoice = sc.nextInt();
                    if (measureChoice == 1 || measureChoice == 2 || measureChoice == 3 || measureChoice == 4) break;
                    else System.out.println("Введите 1, 2, 3 или 4");
                }
                break;
        }
//      3. Пользователю предлагается ввести количество выбранных единиц:
        System.out.println("Введите количество:");
        amount = sc.nextDouble();
        System.out.println("Результат: ");
        switch (choice) {
            case 1:
                switch (measureChoice) {
                    case 1:
                        System.out.println("Килограммов: " + amount);
                        System.out.println("Фунтов: " + amount * 2.20462);
                        break;
                    case 2:
                        System.out.println("Фунтов: " + amount);
                        System.out.println("Килограммов: " + amount / 2.20462);
                        break;
                }
                break;
            case 2:
                switch (measureChoice) {
                    case 1:
                        System.out.println("Метров: " + amount);
                        System.out.println("Миль: " + amount * 0.000621371);
                        System.out.println("Ярдов: " + amount * 1.09361);
                        System.out.println("Футов: " + amount * 3.28084);
                        break;
                    case 2:
                        System.out.println("Метров: " + amount / 0.000621371);
                        System.out.println("Миль: " + amount);
                        System.out.println("Ярдов: " + amount * 1760);
                        System.out.println("Футов: " + amount * 5280);
                        break;
                    case 3:
                        System.out.println("Метров: " + amount * 0.9144);
                        System.out.println("Миль: " + amount / 1760);
                        System.out.println("Ярдов: " + amount);
                        System.out.println("Футов: " + amount * 3);
                        break;
                    case 4:
                        System.out.println("Метров: " + amount * 0.3048);
                        System.out.println("Миль: " + amount / 5280);
                        System.out.println("Ярдов: " + amount / 3);
                        System.out.println("Футов: " + amount);
                        break;
                }
                break;
        }
//      task_7
//      1. Пользователь вводит размер массива и данные с клавиатуры в массив
        int arraySize;
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
                System.out.println("Данное значение имеется в константах");
            }
        }
//      task_8
//      Напишите программу, где пользователь вводит любое целое положительное число n.
//      А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        int n, sum = 0;
        System.out.println("Введите целое число N: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел: " + sum);
//      task_9
//      1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        int arraySize2;
        System.out.println("Введите размер массива: ");
        while (true) {
            arraySize2 = sc.nextInt();
            if (arraySize != 0) break;
        }
        double[] array2 = new double[arraySize2];
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < arraySize2; i++) {
            array2[i] = sc.nextDouble();
        }
//      2. Посчитайте среднее арифметическое элементов массива.
        double average2 = 0;
        for (int i = 0; i < arraySize2; i++) {
            average2 += array2[i];
        }
        average2 /= arraySize2;
        System.out.println("Среднее арифметическое: " + average2);
//      3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i < arraySize2; i++) {
            System.out.println("Элемент №" + (i + 1) + " * " + average2 + " = " + array2[i] * average2);
        }
//      task_9
//      Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
//      а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
//      Размерность матрицы задается пользователем.
        int matrixSize1, matrixSize2;
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
                System.out.println("Элемент № " + (i + 1) + ": " + matrixArray[i][j] + " * 3 = " + matrixArray[i][j] * 3);
            }
        }
    }
}