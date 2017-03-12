/**
 Рисуем прямоугольник
 Ввести с клавиатуры два числа m и n.
 Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

 Пример: m=2, n=4
 8888
 8888
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число m: ");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("Введите число n: ");
        int n = Integer.parseInt(reader.readLine());

     for (int m1 = 0; m1 < m; m1++)
     {
        for (int n1 = 0; n1 < n; n1++)
        {
            System.out.print("8");
        }
         System.out.println();
     }


    }

}