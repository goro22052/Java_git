package com.company;

/*
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
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

        if ((a1 == b1) && (a1== c1)){
            System.out.println( a1 + " "+ b1 + " " +c1);
        }
        else if (a1==b1){
            System.out.println( a1  + " " + b1 );
        }
        else if (a1 == c1){
            System.out.println( a1 + " " + b1);
        }
        else if (b1 == c1){
            System.out.println(b1 + " " + c1);
        }

    }

}
