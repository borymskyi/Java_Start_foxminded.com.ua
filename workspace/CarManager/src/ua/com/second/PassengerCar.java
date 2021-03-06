package ua.com.second;

public class PassengerCar extends Car {

    public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color) {
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
