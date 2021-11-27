package ua.com.third;


//имя класа
public class Person implements Info {


    //Поле
    public String name;


    //Конструктор
    public Person(String name) {
        this.name = name;
    }


    //бизнес методы
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is"+this.name);
    }


    //методы


    //гетеры сетеры


    //другие методы
}
