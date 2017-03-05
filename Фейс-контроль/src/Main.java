
package com.company;
import java.io.*;

/*
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
 */

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите ваше имя: ");
        String name = reader.readLine();

        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(reader.readLine());

        if (age >= 20)
            System.out.println("И 18-ти достаточно");
//        else
//            System.out.println("Добро пожаловать!");

    }
}
