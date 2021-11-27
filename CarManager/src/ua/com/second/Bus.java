package ua.com.second;

public class Bus extends Car {

    public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
        super(name, yearOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 1000) {
            return true;
        } else {
            return false;
        }
    }
}
