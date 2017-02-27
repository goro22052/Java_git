package com.company;

/*
Правило треугольника
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите сторону а: ");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);


        System.out.println("Введите сторону b: ");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        System.out.println("Введите сторону c: ");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        if ((a1 + b1 > c1) && (b1 + c1 > a1) && (a1 + c1 > b1))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }

}










