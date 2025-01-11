package com.ibs.basic;

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
        int[] myArray = {1,2,3,4,5};
//      2. Поменяйте местами первый и последний элемент в массиве
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = temp;
//      3. Вывести в консоль результат суммы первого и среднего элемента
        System.out.println(myArray[0]+myArray[myArray.length / 2]);
    }
}