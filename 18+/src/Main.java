
package com.company;
import java.io.*;

/*
18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
 */

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите ваше имя: ");
        String name = reader.readLine();

        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(reader.readLine());

        if (age < 18)
            System.out.println("Подрасти еще");
        else
            System.out.println("Добро пожаловать!");

    }
}


