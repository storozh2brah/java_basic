package com.ibs.basic.task;

public class Task3 {
    public static void task3exec() {
//      1. Задайте массив из 5 любых целых чисел
        int[] myArray = {1, 2, 3, 4, 5};
//      2. Поменяйте местами первый и последний элемент в массиве
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = temp;
//      3. Вывести в консоль результат суммы первого и среднего элемента
        System.out.println(myArray[0] + myArray[myArray.length / 2]);
    }
}