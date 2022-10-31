package com.java.homework.homework5;

import java.util.Arrays;

import static com.java.homework.homework5.Menu.*;

public class ArrayBoss {

    public static void setArrayWithAlphabet(String[][] array) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = Rand.getRandomString();

            }
        }
    }

    public static void printFinalArray(String[][] array) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void setArrayWithAlphabetAndDouble(String[][] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                count++;
                if (count % 3 == 0) {
                    String str = Double.toString(Rand.getRandomNum());
                    array[i][j] = str;

                }
            }
        }
    }


    public static void getMainDiagonal(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            diagonalArrayMain[i] = array[i][i];
        }

    }


    public static void getSubDiagonal(String[][] array) {

        int maxLength = array.length - 1;
        for (int i = maxLength; i >= 0; i--) {
            diagonalArraySub[i] = array[i][maxLength - i];
        }

    }

    public static void getOneArrayFromDiagonals(String[] array1, String[] array2) {

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            oneArrayFromTwoDiagonals[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            oneArrayFromTwoDiagonals[count++] = array2[j];
        }

    }

    public static void workWithTask3(String[] array) {

        int arrayOfInts[] = new int[3];


        for (int i = 0; i < array.length; i++) {


            try {
                double foo = Double.parseDouble(array[i]);
                int result;


                if (foo >= 1.7) {
                    result = (int) Math.ceil(foo);   // теоретически результат этих значений должен пойти в массив

                } else {
                    result = (int) Math.floor(foo);


                }


                System.out.println(result);
                for (int k = 0; k < 3; k++) {     // Не смогла придумать, как положить все те значения в массив
                    arrayOfInts[k] = result;
                }


            } catch (NumberFormatException e) {

                String arrayString = array[i];
                String veryShortString = arrayString.substring(2, 5);

                StringBuffer buffer = new StringBuffer(veryShortString);
                buffer.insert(1, ",")
                        .insert(3, ",");
                System.out.println(buffer);


            }
        }

        String str = Arrays.toString(arrayOfInts);

        str = str.replace("[", "")
                .replace("]", "")
                .replace(",", "_");

        System.out.println(str);


    }


}



