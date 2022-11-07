package com.java.homework.homework6.main;

import com.java.homework.homework6.seaport.SeaPort;

public class Menu {
    public void startGame(){
        SeaPort mySeaPort = new SeaPort();
        mySeaPort.addShip();
        mySeaPort.printSeaPort();
        mySeaPort.countWaterMass();
        mySeaPort.deleteShip();
    }
}
