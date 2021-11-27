/*
    Добавить новый тип техники который не является кар (комбайн),
    имплементом интерфейса Serviceable, добавить ему пробег и определить готов ли он к сервису.
 */

package ua.com.second;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public static void main(String[] args) {
        //создали объект prius класса PassengerCar
        Serviceable prius = new PassengerCar("Toyota Prius",2008, 1200, 15000, Color.GREEN);

        Serviceable renualt = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

        Serviceable belarus = new DrumHarvester("Belarus");

        List<Serviceable> cars = new ArrayList<>();

        cars.add(prius);
        cars.add(renualt);

        System.out.println(cars);

        //вызвал метод объекта
        prius.addDistance(10000);
        renualt.addDistance(10000);
        belarus.addDistance(10000);

        System.out.println(prius);
        System.out.println(renualt);
        System.out.println(belarus);

        System.out.println(prius.isReadyToService());
        System.out.println(renualt.isReadyToService());
        System.out.println(belarus.isReadyToService());

    }
}