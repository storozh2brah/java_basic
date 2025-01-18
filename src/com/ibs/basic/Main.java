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
//      task_6
    }
}