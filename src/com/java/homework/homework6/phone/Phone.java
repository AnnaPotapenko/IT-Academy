package com.java.homework.homework6.phone;

public class Phone {
    private String number = "+375 (29) 000-00-00";
    private String model = "Модель телефона";
    private double weight = 0.5;

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }
    public String getNumber() {
        String phoneNumber = "+375-29-555-55-55";
        return phoneNumber;
    }
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }
    public void printPhoneNumber(String... phoneNumber) {
        for (String s : phoneNumber) {
            System.out.println(s);
        }
    }

//    public Phone (String model, String number, double weight) {
//        this.model = model;
//        this.number = number;
//        this.weight = weight;
//    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public Phone (String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Это телефон модели " + getModel() + ", весом " + getWeight() + ", номер " + number;
    }
}
