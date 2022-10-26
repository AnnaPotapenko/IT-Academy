package com.java.homework.homework4;


public class Cat {

    private String catName = "Barsik";
    private int catAge = 2;

    static int catObjectCount = 0; // переменная для подсчета колличества созданых котов (экземпляров класса кот)

    {
        catObjectCount += 1;
    }

    public Cat() {

    }

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;

    }


    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return this.catAge;
    }

    public String getCatName() {
        return this.catName;
    }


    @Override
    public boolean equals(Object o) {
        // 1
        if (this == o) {
            return true;
        }

        // 2
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // 3
        Cat cat = (Cat) o;
        return catAge == cat.catAge &&
                catName.equals(cat.catName);
    }

    @Override
    public String toString() {
        return "Cat name is " + catName +
                ", cat age is " + catAge;
    }


}
