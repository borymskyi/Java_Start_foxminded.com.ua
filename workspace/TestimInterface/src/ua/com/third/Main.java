/*
1.  Инкапсуляция
2.  Наследование
3.  Полиморфизм
 */

package ua.com.third;

public class Main {

    public static void main(String[] args) {
        Animal info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        info1.sleep();
    }
}
