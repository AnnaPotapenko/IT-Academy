package com.java.homework.homework3;

import java.util.Scanner;

public class RainbowUserMain {


    public static void main(String[] args) {

        System.out.println("Данная программа позволяет выбрать цвет радуги используя цифры от 1 до 7,\n" +
                "либо выбрать сочетание цветов используя две цифры.");

        System.out.println("Введите сколько цветов вы используете: 1 или 2?");
        Scanner scanner = new Scanner(System.in);
        int colorAmount = scanner.nextInt();

        System.out.println("Ваше общее количество цветов " + colorAmount);
        System.out.println("Теперь выбирайте желаемый цвет радуги, используя цвета от 1 до 7");

        if (colorAmount == 1) {
            Rainbow.yourColor();
        } else if (colorAmount == 2) {

            Rainbow.yourColor();
            Rainbow.yourSecondColor();
        } else {
            System.out.println("Введите 1 или 2");
        }

    }
}

