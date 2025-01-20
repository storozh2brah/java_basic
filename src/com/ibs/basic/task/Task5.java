package com.ibs.basic.task;

import java.util.Scanner;

public class Task5 {
    public static void task5exec() {
//      1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        double num1, num2, operation = 0;
        char symbol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        num1 = sc.nextDouble();
        System.out.println("Введите число 2: ");
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
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + operation);
    }
}