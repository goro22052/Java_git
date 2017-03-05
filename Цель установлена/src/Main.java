import java.io.*;
/*
Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число a: ");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);

        System.out.print("Введите число b: ");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        int coordinate = 0;

        if ((a1 > 0) && (b1 > 0))
            coordinate = 1;
        else if ((a1 < 0) && (b1 > 0))
            coordinate = 2;
        else if ((a1 < 0) && (b1 < 0))
            coordinate = 3;
        else if ((a1 > 0) && (b1 < 0))
            coordinate = 4;


        System.out.println(coordinate);

    }
}



