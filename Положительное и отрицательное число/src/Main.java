package com.company;
/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число
отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import javax.sound.midi.Soundbank;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое число: ");
        String a = reader.readLine();
        int i = Integer.parseInt(a);  //переводим String  в int

        if ( i > 0 )
            i = i * 2;

        else
            if ( i < 0)
            i = i+1;

        System.out.println(i);





    }
}