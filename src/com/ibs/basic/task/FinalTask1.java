package com.ibs.basic.task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalTask1 {
    public static void finalTask1exec() {
//        Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
//        Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
//        Пример для теста работы программы:
//        - Курс доллара: 67,55
//                - Количество рублей: 1000
//                - Итого: 14,80 долларов
        double rubles, course, dollars;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Введите текущий курс: ");
        course = sc.nextDouble();
        System.out.print("Введите количество рублей: ");
        rubles = sc.nextInt();
        dollars = rubles / course;
        BigDecimal roundedDollars = new BigDecimal(dollars).setScale(2, RoundingMode.HALF_UP);
        dollars = roundedDollars.doubleValue();
        System.out.print("Долларов: " + dollars);
    }
}