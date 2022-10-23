package com.java.homework.homework3;

import java.util.Scanner;

public class Rainbow {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int TREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;


    public static void yourColor() {
        Scanner scanner = new Scanner(System.in);
        int userFirstColor = scanner.nextInt();

        switch (userFirstColor) {
            case ONE:
                System.out.println("Ваш цвет красный");
                break;
            case TWO:
                System.out.println("Ваш цвет оранжевый");
                break;
            case TREE:
                System.out.println("Ваш цвет желтый");
                break;
            case FOUR:
                System.out.println("Ваш цвет зеленый");
                break;
            case FIVE:
                System.out.println("Ваш цвет голубой");
                break;
            case SIX:
                System.out.println("Ваш цвет синий");
                break;
            case SEVEN:
                System.out.println("Ваш цвет фиолетовый");
                break;
            default:
                System.out.println("Такого цвета нет в радуге");
        }
    }

    public static void yourSecondColor() {
        System.out.println("Введите номер второго цвета 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int userSecondColor = scanner.nextInt();

        switch (userSecondColor) {
            case ONE:
                System.out.println(" и красный");
                break;
            case TWO:
                System.out.println("и оранжевый");
                break;
            case TREE:
                System.out.println("и желтый");
                break;
            case FOUR:
                System.out.println("и зеленый");
                break;
            case FIVE:
                System.out.println("и голубой");
                break;
            case SIX:
                System.out.println("и синий");
                break;
            case SEVEN:
                System.out.println("и фиолетовый");
                break;
            default:
                System.out.println("Такого цвета нет в радуге");
        }
    }


}





