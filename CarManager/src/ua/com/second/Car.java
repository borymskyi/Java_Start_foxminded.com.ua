/*
1.  Поля
2.  Конструкторы
3.  Бизнес методы
4.  гетеры и сетеры
5.  Служебные методы (toString/equals)
 */

package ua.com.second;

import com.sun.javaws.IconUtil;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import java.util.Objects;

public abstract class Car implements Serviceable {


    //1.    Поля
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;


    //2.    Конструкторы
    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }


    //3.    Методы (бизнес)
    public void addDistance(int additinalDistance) {
        if (additinalDistance < 0) {
            System.out.println("distance must be > 0");
        } else {
            distance += additinalDistance;
            distanceOnService += additinalDistance;
        }
    }


    //4.    Методы (геттеры и сеттеры)
    public int getDistanceOnService() {
        return distanceOnService;
    }


    //5.    Методы (служебные)
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }
}