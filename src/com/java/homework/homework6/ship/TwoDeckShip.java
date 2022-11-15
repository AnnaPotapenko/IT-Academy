package com.java.homework.homework6.ship;
import com.java.homework.homework6.container.Container;
import java.util.Random;

public class TwoDeckShip extends Ship {
    public String deckName = " (двухпалубный)";
    public String name = setName();
    public Ship createTwoDeckShip() {
        return new Ship(setLargeShipNameRandom(), name);
    }
    private String setLargeShipNameRandom() {
        String[] twoDeckShipNameArray = {"Приговор", "Скорпион", "Мёртвец", "Иуда", "Жемчужина", "Смерть", "Приз", "Девочка", "Призрак", "Месть", "Колокол", "Цербер", "Вдова", "Алконавтика", "Ангел", "Пандора", "Левиафан"};
        return twoDeckShipNameArray[new Random().nextInt(twoDeckShipNameArray.length)] + deckName;
    }
    private String setName() {
        Container box = new Container();
        return String.valueOf(box.getBox());
    }
    TwoDeckShip() {
    }


}
