package com.company;
/*
Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

*/


import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число а: ");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);


        System.out.println("Введите число b: ");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        if (a1 <= b1) {
            System.out.println(a1);
        }
        else
            System.out.println(b1);

    }
}