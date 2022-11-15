package com.java.homework.homework7;

public enum RobotDetail {
    SMALL_HEAD("маленькая голова"),
    MEDIUM_HEAD("средняя голова"),
    LARGE_HEAD("большая голова"),
    SMALL_BODY("маленькое тело"),
    MEDIUM_BODY("среднее тело"),
    LARGE_BODY("большое тело");

    private final String title;

    public String getTitle() {
        return title;
    }

    RobotDetail(String title) {
        this.title = title;
    }


}
