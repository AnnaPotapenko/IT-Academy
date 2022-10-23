package com.java.homework.homework3;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        System.out.println("Выбирайте порядковый номер месяца");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();

        if (monthNumber == 1  || monthNumber == 12  || monthNumber == 2){
            System.out.println("Ваш месяц зимний");
        } else if (monthNumber == 3  || monthNumber == 4  || monthNumber == 5){
            System.out.println("Ваш месяц весенний");
        } else if (monthNumber == 6  || monthNumber == 7  || monthNumber == 8) {
            System.out.println("Ваш месяц летний");
        } else if (monthNumber == 9  || monthNumber == 10  || monthNumber == 11){
            System.out.println("Ваш месяц осенний");
        }else {
            System.out.println("Такого месяца не существует");
        }

    }
}
