package com.java.homework.homework5;


import java.util.Arrays;

public class Menu {

    static String[][] myArray = new String[10][10];
    static String[] diagonalArrayMain = new String[10];
    static String[] diagonalArraySub = new String[10];

    static String[] oneArrayFromTwoDiagonals = new String[20];


    public static void startGo() {

        ArrayBoss.setArrayWithAlphabet(myArray);

        ArrayBoss.setArrayWithAlphabetAndDouble(myArray);

        ArrayBoss.getMainDiagonal(myArray);

        ArrayBoss.getSubDiagonal(myArray);

        System.out.println("Диагонали равны? : " + Arrays.equals(diagonalArrayMain, diagonalArraySub));

        ArrayBoss.getOneArrayFromDiagonals(diagonalArrayMain, diagonalArraySub);

        System.out.println("Выведу массив со значениями диагоналей для наглядности\n" + Arrays.toString(oneArrayFromTwoDiagonals));

        ArrayBoss.workWithTask3(oneArrayFromTwoDiagonals);

        ArrayBoss.printFinalArray(myArray);


    }
}
