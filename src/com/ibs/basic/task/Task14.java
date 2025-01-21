package com.ibs.basic.task;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void task14exec() {
//        Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        int[] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(41) - 20;
        }
//        1. Выведите максимальный и минимальный элемент массива.
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
//        2. Из максимального и минимального значения выведите наибольшее по модулю.
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Наибольшее по модулю: " + max);
        } else if (Math.abs(max) < Math.abs(min)){
            System.out.println("Наибольшее по модулю: " + min);
        } else {
            System.out.println("Числа по модулю равны");
        }
    }
}