package com.java.homework.homework6.container;
import com.java.homework.homework6.constants.Constant;
import com.java.homework.homework6.ship.Ship;

public class ConeContainer extends Container {
    public int containerV = setContainerV();
    private int waterWeight = setWaterWeight();
    public ConeContainer() {
        super();
    }
    public ConeContainer createConeContainer() {
        ConeContainer newConeContainer = new ConeContainer();
        return newConeContainer;
    }
    private int setWaterWeight() {
        int waterWeight;
        Ship a = new Ship();
        int random = a.chooseRandomShipSize();
        Constant c = new Constant();
        if (random == 1) {
            waterWeight = c.WATER_DENSITY_1 * containerV;
        } else {
            waterWeight = c.WATER_DENSITY_2 * containerV;
        }
        return waterWeight;
    }
    private int setContainerV() {
        int radius = getContainerDiameter() / 2;
        double V = (Math.PI * radius * radius * getContainerHeight()) / 3;
        return (int) V;
    }

    public int getWaterWeight() {
        return waterWeight;
    }
    @Override
    public String toString() {
        return getCone() + "Масса перевозимой воды равна " + getWaterWeight() + " кг";
    }
}
