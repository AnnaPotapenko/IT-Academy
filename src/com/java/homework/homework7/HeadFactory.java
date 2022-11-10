package com.java.homework.homework7;

public class HeadFactory {

    public void createRobotLargeHead(Robot robotAddHead) {
        robotAddHead.setHeadDetail(RobotDetail.LARGE_HEAD.getTitle());
    }

    public void createRobotMediumHead(Robot robotAddHead) {
        robotAddHead.setHeadDetail(RobotDetail.MEDIUM_HEAD.getTitle());
    }

    public void createRobotSmallHead(Robot robotAddHead) {
        robotAddHead.setHeadDetail(RobotDetail.SMALL_HEAD.getTitle());
    }

}

