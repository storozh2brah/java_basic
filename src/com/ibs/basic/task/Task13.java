package com.ibs.basic.task;

import java.util.Scanner;

public class Task13 {
    public static void task13exec() {
//        Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
//        Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Введите строку из слов, разделенных пробелами: ");
        while (true) {
            boolean hasLetters = false;
            str = sc.nextLine();

            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    hasLetters = true;
                }
            }

            if (str.contains(" ") && hasLetters) {
                break;
            } else {
                System.out.print("В строке нет пробелов или букв. Введите снова: ");
            }
        }
//        1. Выведите слова, состоящие только из латиницы.
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                count++;
            }
        }
//        2. Выведите количество этих слов.
        System.out.print("Количество слов на латинице: " + count);
    }
}