package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите год: ");
        String sYer = reader.readLine();
        int iYer = Integer.parseInt(sYer);

        int x;


        if ((iYer % 4 == 0)  && (iYer % 100 != 0) || (iYer % 400 == 0))
            x = 366;
        else
            x = 365;

        System.out.println("количество дней в году: " + x);

    }
}
