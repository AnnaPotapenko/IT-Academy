package com.java.homework.homework6.seaport;
import com.java.homework.homework6.ship.Ship;

import java.util.Arrays;
import java.util.Scanner;
public class SeaPort {
    public Ship[] seaPort = new Ship[10];

    public void printSeaPort() {
        for (Ship ship : seaPort) {
            System.out.println(ship);
        }
        System.out.println();
    }
    public void addShip() {
        for (int i = 0; i < seaPort.length; i++) {
            Ship newShip = new Ship();
            seaPort[i] = newShip.createNewShip();
        }
    }
    public void deleteShip() {
        System.out.println("Хотите удалить корабль? Введите 1 если Да, и 2 - если нет" );
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt()==1){
            int indexOfDeletedShip = foundIndexOfShipForDeleteOption();
            seaPort[indexOfDeletedShip] = null;
            for (Ship ship : seaPort) {
                System.out.println(ship);
            }
            System.out.println("Хотите добавить корабль? Введите 1 если Да, и 2 - если нет");
            int answer = scanner.nextInt();
            if (answer == 1) {
                Ship newShip = new Ship();
                seaPort[indexOfDeletedShip] = newShip.createNewShip();
                for (Ship ship : seaPort) {
                    System.out.println(ship);
                }
                System.out.println();
            }
        }
    }
    public void countWaterMass() {
        String[] subStr = new String[1];
        int [] shipWaterArray = new int[10];
        int waterMassSum = 0;
        for (int a = 0; a<1;a++) {
            String name = Arrays.toString(seaPort);
            String delimiter = " ";
            subStr = name.split(delimiter);
        }
        shipWaterArray[0]= Integer.parseInt(subStr[10]);
        shipWaterArray[1]= Integer.parseInt(subStr[23]);
        shipWaterArray[2]= Integer.parseInt(subStr[36]);
        shipWaterArray[3]= Integer.parseInt(subStr[49]);
        shipWaterArray[4]= Integer.parseInt(subStr[62]);
        shipWaterArray[5]= Integer.parseInt(subStr[75]);
        shipWaterArray[6]= Integer.parseInt(subStr[88]);
        shipWaterArray[7]= Integer.parseInt(subStr[101]);
        shipWaterArray[8]= Integer.parseInt(subStr[114]);
        shipWaterArray[9]= Integer.parseInt(subStr[127]);
        for (int j : shipWaterArray) {
            waterMassSum = waterMassSum + j;
        }
        System.out.println(waterMassSum/1000 + " тонны");
    }

    private int foundIndexOfShipForDeleteOption() {
        System.out.println("Введите имя корабля");
        Scanner scanner = new Scanner(System.in);
        String searchedLine = scanner.nextLine();
        int i = -1;
        for (Ship ship : seaPort) {
            i++;
            String name = String.valueOf(ship);
            String[] subStr;
            String delimiter = " ";
            subStr = name.split(delimiter);
            for (String s : subStr) {
                if (searchedLine.equals(s)) {
                    System.out.println("Номер твоего корабля - " + i);
                    return i;
                }
            }
        }
        return i;
    }
}









