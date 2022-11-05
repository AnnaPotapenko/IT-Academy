package com.java.homework.homework6.phone;

public class Menu {
    public void start(){
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println("Задание 4");

        phone1.receiveCall("Вася");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Петя");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Даша");
        System.out.println(phone3.getNumber());

        System.out.println("Задание 9");
        phone1.receiveCall("Вася", "+375-00-000-00-01");

        System.out.println("Задание 10, переменная длинны");
        phone1.printPhoneNumber("+375 29 325 22 55", "+375 33 958 33 55", "+375 29 478 11 22","+375 22 114 55 88");


    }

}
