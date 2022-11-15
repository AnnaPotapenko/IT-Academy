package com.java.homework.homework6.ship;

public class Ship {
    private String shipName;
    private String containerType;

    public Ship createNewShip() {
        int shipSize = chooseRandomShipSize();
        Ship newShip;
        if (shipSize == 1) {
            OneDeckShip newOneDeckShip = new OneDeckShip();
            newShip = newOneDeckShip.createOneDeckShip();
        } else {
            TwoDeckShip newTwoDeckShip = new TwoDeckShip();
            newShip = newTwoDeckShip.createTwoDeckShip();
        }
        return newShip;
    }
    public int chooseRandomShipSize() {
        return (int) (Math.random() * (1 + 1)) + 1;
    }
    public Ship() {
    }
    public Ship(String name, String boxName) {
        this.shipName = name;
        this.containerType = boxName;
    }

    @Override
    public String toString() {
        return "Корабль " + shipName + ". Перевозит " + containerType + ". ";
    }

}


