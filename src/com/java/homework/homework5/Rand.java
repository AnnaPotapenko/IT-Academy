package com.java.homework.homework5;

import java.util.Random;

public class Rand {

    public static String getRandomString() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder newRandomStr = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(52);
            newRandomStr.append(str.charAt(number));

        }
        return newRandomStr.toString();

    }


    public static double getRandomNum() {
        double leftLimit = 1D;
        double rightLimit = 10D;
        double generatedDouble = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);
        double scale = Math.pow(10, 5);
        double randomResult = Math.ceil(generatedDouble * scale) / scale;
        return randomResult;
    }


}
