package com.company;
/**
 Настя или Настя?
 Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
 Если имена и длины имен разные — ничего не выводить.
 */
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое имя: ");
        String name1 = reader.readLine();

        System.out.print("Ыыедиет второе имя: ");
        String name2 = reader.readLine();

        if(name1.equals(name2)) System.out.println("Имена идентичны");
        else if (name1.length() == name2.length()) System.out.println("Длины имен равны");


    }
}
