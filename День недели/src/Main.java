package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер дня недели: ");
        String sDay = reader.readLine();
        int iDay = Integer.parseInt(sDay);

        switch (iDay) {
//            System.out.println("такого дня недели не существует");
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;

            default:
                System.out.println("такого дня недели не существует");
                break;

        }
    }
}