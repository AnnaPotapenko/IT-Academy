package com.java.homework.homework7;

public class BodyFactory {

    public void createRobotLargeBody(Robot robotAddBody) {
        robotAddBody.setBodyDetail(RobotDetail.LARGE_BODY.getTitle());
    }

    public void createRobotMediumBody(Robot robotAddBody) {
        robotAddBody.setBodyDetail(RobotDetail.MEDIUM_BODY.getTitle());
    }

    public void createRobotSmallBody(Robot robotAddBody) {
        robotAddBody.setBodyDetail(RobotDetail.SMALL_BODY.getTitle());
    }

}
