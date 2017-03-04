package com.company;
/*
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

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

        System.out.println("Введите число c: ");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);


        System.out.println("Введите число d: ");
        String d = reader.readLine();
        int d1 = Integer.parseInt(d);


        if ((a1 >= b1) && (a1 >= c1)  && (a1 >= d1))
            System.out.println(a1);

            else if ((b1 >= c1) && (b1 >= d1))
                System.out.println(b1);
            else if (c1 >= d1)
                System.out.println(c1);
            else
                System.out.println(d1);
        }
    }

