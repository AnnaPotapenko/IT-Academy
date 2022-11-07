package com.java.homework.homework6.container;
import com.java.homework.homework6.constants.Constant;
import com.java.homework.homework6.ship.Ship;

public class CylinderContainer extends ConeContainer {
    public CylinderContainer() {
        super();
    }
    public void createCylinderContainer() {
        new CylinderContainer();
    }
    public int getWaterWeight() {
        return waterWeight;
    }
    private int containerV = setContainerV();
    private int waterWeight = setWaterWeight();

    private int setContainerV() {
        int radius = getContainerDiameter() / 2;
        double V = Math.PI * Math.pow(radius, 2) * getContainerHeight();
        return (int) V;
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
    @Override
    public String toString() {
        return getCylinder() + "Масса перевозимой воды равна " + getWaterWeight() + " кг";
    }

}
