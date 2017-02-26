package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Программа по номеру месяца определяет время года(сезон)" );

        System.out.print("Введите номер месяца:");
        int month  = scanner.nextInt();

        if ((month > 2) && (month < 6))
            System.out.println("Это весна");
        else
            if ((month > 5) && (month < 9))
                System.out.println("Это лето");
            else
                if ((month > 8) && (month < 12 ))
                    System.out.println("Это осень");
                else
                    System.out.println("Это зима");

    }
}