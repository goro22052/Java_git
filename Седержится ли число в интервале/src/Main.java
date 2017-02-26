package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Программа определяет находится ли число в интеварле чисел от 50 до 100" );

        System.out.print("Введите число а:");
        int a = scanner.nextInt();

        if ((a > 50)&&(a < 100))
            System.out.println( "Число " + a + " содержится в интервале." );
        else
            System.out.println("Число " + a + " не содержится в интервале.");

    }
}