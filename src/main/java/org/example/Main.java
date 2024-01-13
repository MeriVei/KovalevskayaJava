package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задание 1
        System.out.print("Введите число:");
        if (scanner.nextInt() > 7) {
            System.out.println("Привет");
        }
        System.out.println("---------------------------------------------");
        //Задание 2
        System.out.print("Введите имя: ");
        String name = scanner.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println("---------------------------------------------");
        //Задание 3
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        System.out.println("Введите значения элементов массива.");
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) + ": ");
            mas[i] = scanner.nextInt();
        }
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < size; i++) {
            if (mas[i] % 3 == 0) {
                System.out.println((i+1) + ": " + mas[i]);
            }
        }
    }
}