package ua.com.fourth;

import java.util.*;
import java.util.Scanner;

public class StringUtil
{

    public static void main(String[] args)
    {
        //learning arrays
        char[][] letters = {{'a', 'b'},
                            {'x', 'y'}};
        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < letters[i].length; j++){
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }
        //second
        char[][] letters2 = new char[2][2];
        for(int i = 0; i < letters2.length; i++){
            for(int j = 0; j < letters2[i].length; j++){
                System.out.print(letters2[i][j] + " ");
            }
            System.out.println();
        }


        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        //split string
        String source = ("Hello " + userName);
        String[] words = source.split(" "); //{"Hello", "Dmytrii"}
        char[] letters5 = words[0].toCharArray(); //{'H', 'e', 'l', 'l', 'o'}
        for(int i = 0; i < letters5.length; i++){
            System.out.print(letters5[i]);
        }

    }
}
