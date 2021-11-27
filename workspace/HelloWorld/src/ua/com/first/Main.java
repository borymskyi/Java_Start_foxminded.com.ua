package ua.com.first;

public class Main {

    public static void main(String[] args) {
        float i = 6;
        float j = 7;
        float answer = j / i;
        String massage = "your result: ";
        String stringAnswer = massage + answer;

        boolean isMoreThenOne;
        if (answer > 1 ) {
            isMoreThenOne = true;
        } else {
            isMoreThenOne = false;
        }

        System.out.println(stringAnswer + " " + isMoreThenOne);
    }
}
