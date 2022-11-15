package com.java.homework.homework6.container;
import com.java.homework.homework6.ship.Ship;

public class Container {
    private int containerHeight = chooseRandomBoxHeight();
    private int containerDiameter = containerSizePick();

    public Container() {
    }
    public Container getBox() {
        int a = chooseRandomBoxSize();
        Container newContainer;
        if (a == 1) {
            SquareContainer box = new SquareContainer();
            box.createSquareContainer();
            newContainer = box;
        } else if (a == 2) {
            ConeContainer box = new ConeContainer();
            box.createConeContainer();
            newContainer = box;
        } else {
            CylinderContainer box = new CylinderContainer();
            box.createCylinderContainer();
            newContainer = box;
        }
        return newContainer;
    }

    private int containerSizePick() {
        Ship newShip = new Ship();
        int a = newShip.chooseRandomShipSize();
        int containerSize;
        if (a == 1) {
            containerSize = 20;
        } else {
            containerSize = 10;
        }
        return containerSize;
    }
    private int chooseRandomBoxSize() {
        int b = 1;
        int a = 3;
        return b + (int) (Math.random() * a);
    }
    private int chooseRandomBoxHeight() {
        int b = 10;
        int a = 100;
        return b + (int) (Math.random() * a);
    }
    protected String getSquare() {return "Квадратный контейнер. ";}

    protected String getCone() {
        return "Конусовидный контейнер. ";
    }

    protected String getCylinder() {
        return "Цилиндрический контейнер. ";
    }

    protected int getContainerHeight() {
        return containerHeight;
    }

    protected int getContainerDiameter() {
        return containerDiameter;
    }

}
