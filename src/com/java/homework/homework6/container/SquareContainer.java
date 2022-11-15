package com.java.homework.homework6.container;
import com.java.homework.homework6.constants.Constant;
import com.java.homework.homework6.ship.Ship;

public class SquareContainer extends Container {
    private int waterWeight = setWaterWeight();
    public SquareContainer() {
        super();
    }
    public void createSquareContainer() {
        new SquareContainer();
    }
    private int setContainerV() {
        return getContainerDiameter() * 2 * getContainerHeight();
    }
    private int setWaterWeight() {
        int waterWeight;
        Ship a = new Ship();
        int random = a.chooseRandomShipSize();
        Constant c = new Constant();
        if (random == 1) {
            waterWeight = c.WATER_DENSITY_1 * setContainerV();
        } else {
            waterWeight = c.WATER_DENSITY_2 * setContainerV();
        }
        return waterWeight;
    }
    private int getWaterWeight() {
        return waterWeight;
    }

    @Override
    public String toString() {
        return getSquare() + "Масса перевозимой воды равна " + getWaterWeight() + " кг";
    }
}




