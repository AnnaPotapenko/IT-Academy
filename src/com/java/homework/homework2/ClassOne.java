package com.java.homework.homework2;

public class ClassOne {
    public static void main(String[] args){
        //Создаем локальные переменные используя поля класса2
        ClassTwo MyClass = new ClassTwo();
        MyClass.setMyByte((byte)-5); // Пришлось привести к байту, т.к. значение в классе указано как байт, а просто число 5 это инт.
        MyClass.setMyShort((byte)32000);
        MyClass.setMyInt(1000000);
        MyClass.setMyLong(5215468452154584L);
        MyClass.setMyFloat(2.5F);
        MyClass.setMyDouble(2594.26547);
        MyClass.setMyChar('\u0021');
        MyClass.setMyBoolean(false);

        MyClass.setMyByteWrapper((byte)8);
        MyClass.setMyShortWrapper((short)15000);
        MyClass.setMyIntWrapper(25648651);
        MyClass.setMyLongWrapper(-16468451654L);
        MyClass.setMyFloatWrapper(-15.2F);
        MyClass.setMyDoubleWrapper(154.2);
        MyClass.setMyCharWrapper('\u0024');
        MyClass.setMyBooleanWrapper(true);

        MyClass.setMyString("Это строка");
        // Вывод на консоль
        System.out.println("Выводим на консоль примитивные переменные:");
        System.out.println("byte = " + MyClass.getMyByte());
        System.out.println("short = " + MyClass.getMyShort());
        System.out.println("int = " + MyClass.getMyInt());
        System.out.println("long = " + MyClass.getMyLong());
        System.out.println("float = " + MyClass.getMyFloat());
        System.out.println("double = " + MyClass.getMyDouble());
        System.out.println("char is " + MyClass.getMyChar());
        System.out.println("boolean is " + MyClass.getMyBoolean());
        System.out.println("Выводим на консоль обёртки:");
        System.out.println("Byte = " + MyClass.getMyByteWrapper());
        System.out.println("Short = " + MyClass.getMyShortWrapper());
        System.out.println("Integer = " + MyClass.getMyIntWrapper());
        System.out.println("Long = " + MyClass.getMyLongWrapper());
        System.out.println("Float = "+ MyClass.getMyFloatWrapper());
        System.out.println("Double = " + MyClass.getMyDoubleWrapper());
        System.out.println("Character is " + MyClass.getMyCharWrapper());
        System.out.println("Boolean is " + MyClass.getMyBooleanWrapper());
        System.out.println("Вывод строки:");
        System.out.println("String: " + MyClass.getMyString());
        System.out.println("Конец");
    }
}
