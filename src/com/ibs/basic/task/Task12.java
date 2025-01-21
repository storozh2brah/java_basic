package com.ibs.basic.task;

import java.util.Scanner;

public class Task12 {
    public static void task12exec() {
//        Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
        Scanner sc = new Scanner(System.in);
        String str = "I like Java!!!";
//        1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        boolean containsStr = str.contains("Java");
        System.out.println(containsStr);
//        2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        boolean startsWithStr = str.startsWith("I like");
        System.out.println(startsWithStr);
//        3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        boolean endsWithStr = str.endsWith("!!!");
        System.out.println(endsWithStr);
//        4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (containsStr == true && startsWithStr == true && endsWithStr == true) {
            System.out.println(str.toUpperCase());
        }
//        5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        String changedStr = str.replaceAll("a", "o");
        System.out.println(changedStr.substring(7, 11));
    }
}