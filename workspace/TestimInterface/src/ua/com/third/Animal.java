package ua.com.third;

//имя класа
public class Animal implements Info{

    //Поле
    public int id;

    //Конструктор
    public Animal(int id) {
        this.id = id;
    }

    //Метод
    public void sleep() {
        System.out.println("Im sleeping");
    }
    public void showInfo(){
        System.out.println("Id is" +this.id);
    }



}
