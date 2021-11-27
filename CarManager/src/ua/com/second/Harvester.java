/*
1.  Поля
2.  Конструкторы
3.  Бизнес методы
4.  гетеры и сетеры
5.  Служебные методы (toString/equals)
 */

package ua.com.second;

public abstract class Harvester implements Serviceable {


    //1.    Поля
    String name;
    private int distance = 0;
    protected int distanceOnService = 0;


    //2.    Конструкторы
    public Harvester(String name) {
        this.name = name;
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
        return "Harvester{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }
}