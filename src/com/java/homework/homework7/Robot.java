package com.java.homework.homework7;

public class Robot {
    private String name;

    private String HeadDetail;

    private String BodyDetail;

    public void setHeadDetail(String headDetail) {
        this.HeadDetail = headDetail;
    }

    public void setBodyDetail(String bodyDetail) {
        this.BodyDetail = bodyDetail;
    }

    public Robot(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Робот по имени " +
                name +
                ". Он состоит из таких деталей как: " + HeadDetail +
                ", " + BodyDetail + ".";
    }


}
