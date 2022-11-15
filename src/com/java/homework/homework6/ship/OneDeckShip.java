package com.java.homework.homework6.ship;
import com.java.homework.homework6.container.Container;
import java.util.Random;

public class OneDeckShip extends Ship{
    public String deckName = " (однопалубный)";
    public String boxName = setName();
    public Ship createOneDeckShip(){
        return new Ship(setSmallShipNameRandom(), boxName);
    }
    private String setName(){
        Container box = new Container();
        return String.valueOf(box.getBox());
    }
    private String setSmallShipNameRandom() {
        String[] oneDeckShipNameArray = new String[] {"Санта-Мария", "Ваза", "Виктория", "Юнион", "Мир", "Паллада", "Афродита", "Лев", "Лань", "Надежда", "Крузенштерн", "Катти", "Индевор", "ФрансII"};
        return oneDeckShipNameArray[new Random().nextInt(oneDeckShipNameArray.length)] + deckName;
    }
    OneDeckShip(){

    }

}
