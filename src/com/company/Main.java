package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а:");

        int a = scanner.nextInt();

        System.out.print("Введите число b:");
        int b = scanner.nextInt();


        int center_number =  10;  //число c которым сравниваем

        if (Math.abs(center_number - a) < (Math.abs(center_number -b )) ) // узнаем разницу чисел и сравниваем их модули
            System.out.println(a);
        else
            System.out.println(b);

    }
}