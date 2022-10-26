package com.java.homework.homework4;


import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int catCount = 1;
        int catNumberForDoWhile = 1;

        System.out.println("Выводим котиков с циклом while и дефолтным значением");


        while (catCount != 11) {
            System.out.print("Cat № " + catCount + ": ");
            System.out.println(new Cat());
            catCount++;

        }
        System.out.println("Кол-во котов = " + Cat.catObjectCount);


        System.out.println("Выводим котиков через цикл for с рандомным именем и возрастом");

        for (int i = 1; i < 11; i++) {
            Cat cat2 = new Cat();
            String catName = getRandomString();
            int catAge = getRandomAge();

            cat2.setCatAge(catAge);
            cat2.setCatName(catName);
            System.out.print("Cat № " + i + ": ");
            System.out.println(cat2.getCatName() + cat2.getCatAge());
        }
        System.out.println("Кол-во котов = " + Cat.catObjectCount);


        System.out.println("Выводим котиков через цикл do while с конструктором");


        do {

            System.out.print("Cat № " + catNumberForDoWhile + ": ");
            System.out.println(new Cat("Polly", 11));
            catNumberForDoWhile++;


        } while (catNumberForDoWhile != 11);
        System.out.println("Кол-во котов = " + Cat.catObjectCount);


        System.out.println("Выводим котиков через цикл foreach и массив");

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Billy", 6);
        catArray[1] = new Cat("Charly", 5);
        catArray[2] = new Cat("Barsik", 2);
        catArray[3] = new Cat("Mary", 1);
        catArray[4] = new Cat("Barsik", 2);
        for (Cat catDiscription : catArray) {
            System.out.println(catDiscription);
        }

        System.out.println("Кол-во котов = " + Cat.catObjectCount);

        System.out.println("Сравним экземпляры класса Cat, находящиеся в массиве");

        System.out.println(catArray[2].equals(catArray[0])); // должно быть фолс
        System.out.println(catArray[2].equals(catArray[4])); // тру

        System.out.println("Создадим 2 новых экземпляра и сравним их");

        Cat catBarsik2 = new Cat("Barsik", 2);
        Cat catBarsic2 = new Cat("Barsic", 2);

        System.out.println(catBarsik2.equals(catArray[2])); // должно быть тру
        System.out.println(catBarsic2.equals(catBarsik2)); // должно быть фолс

        System.out.println("Кол-во котов = " + Cat.catObjectCount);


    }

    private static int getRandomAge() {
        Random random = new Random();

        return random.nextInt(28) + 1;

    }


    private static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int stringLength = 6;
        Random random = new Random();


        return random.ints(leftLimit, rightLimit + 1)
                .limit(stringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
