package com.java.homework.homework10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public void start() {
        System.out.println("Пользователь, введи число от 3 до 5.");
        int userNumber = getUserNumber();
        try {
            isUserNumberCorrectNumber(userNumber);
            System.out.println("Ваше число " + userNumber);
        } catch (ExceptionNumberLess | ExceptionNumberMore e) {
            System.err.println(e.getMessage());
        }
    }

    private int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        int a;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Вы ввели не число!");
            a = 3;
            System.out.println("Поэтому мы выбрали число за вас.");
        }
        return a;
    }

    private void isUserNumberCorrectNumber(int i) throws ExceptionNumberLess, ExceptionNumberMore {
        if (i < 3) {
            throw new ExceptionNumberLess("Ошибка! Число меньше диапазона");
        } else if (i > 5) {
            throw new ExceptionNumberMore("Ошибка! Число больше диапазона");
        }
    }
}


