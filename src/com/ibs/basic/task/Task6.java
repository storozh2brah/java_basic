package com.ibs.basic.task;

import java.util.Scanner;

public class Task6 {
    public static void task6exec() {
//      Напишите программу конвертер физических величин:
//      1. Пользователю предлагается на выбор ввести массу или расстояние:
        int choice, measure = 0;
        double amount;
        Scanner sc = new Scanner(System.in);
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
                    measure = sc.nextInt();
                    if (measure == 1 || measure == 2) break;
                    else System.out.println("Введите 1 или 2");
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метры; 2- мили; 3 - ярды; 4- футы");
                while (true) {
                    measure = sc.nextInt();
                    if (measure == 1 || measure == 2 || measure == 3 || measure == 4) break;
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
                switch (measure) {
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
                switch (measure) {
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
    }
}