package com.java.homework.homework7;

public class Runner {

    public void createRobot1() {

        Robot robot = new Robot("Билли");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotLargeHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotLargeBody(robot);
        print(robot);
    }

    public void createRobot2() {

        Robot robot = new Robot("Олег");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotLargeHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotMediumBody(robot);
        print(robot);
    }

    public void createRobot3() {

        Robot robot = new Robot("Марго");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotLargeHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotSmallBody(robot);
        print(robot);
    }

    public void createRobot4() {

        Robot robot = new Robot("Вася");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotMediumHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotLargeBody(robot);
        print(robot);
    }

    public void createRobot5() {

        Robot robot = new Robot("Леня");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotMediumHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotMediumBody(robot);
        print(robot);
    }

    public void createRobot6() {

        Robot robot = new Robot("Игорь");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotMediumHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotSmallBody(robot);
        print(robot);
    }

    public void createRobot7() {

        Robot robot = new Robot("Кот");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotSmallHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotLargeBody(robot);
        print(robot);
    }

    public void createRobot8() {

        Robot robot = new Robot("Пёс");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotSmallHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotMediumBody(robot);
        print(robot);
    }

    public void createRobot9() {

        Robot robot = new Robot("Кира");
        HeadFactory headFactory = new HeadFactory();
        headFactory.createRobotSmallHead(robot);
        BodyFactory bodyFactory = new BodyFactory();
        bodyFactory.createRobotSmallBody(robot);
        print(robot);
    }

    private void print(Robot robot) {
        System.out.println(robot);


    }


}
