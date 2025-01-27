package com.ibs.basic.task;

import java.util.HashSet;
import java.util.Scanner;

public class FinalTask3 {
    public static void finalTask3exec() {
//        Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
//        Среди данных строк найти строку с максимальным количеством различных символов.
//        Если таких строк будет много, то вывести первую.
//        Пример для теста работы программы:
//        Количество строк: 3
//        Строка 1: привет
//        Строка 2: анализ
//        Строка 3: 111111111111
//        Ответ: привет
        Scanner sc = new Scanner(System.in);
        int hasDiverseChars = 0, strNum = 0;
        String str = "";
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1) + ": ");
            strArr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            HashSet<Character> uniqueChars = new HashSet<>(strArr[i].length());
            for (char c : strArr[i].toCharArray()) {
                uniqueChars.add(c);
            }
            if (uniqueChars.size() > hasDiverseChars) {
                hasDiverseChars = uniqueChars.size();
                strNum = i;
            }
        }
        System.out.println("Строка с наибольшим количеством различных символов: " + strArr[strNum]);
    }
}