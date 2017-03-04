
import java.io.*;

/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
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

        System.out.print("Введите число c: ");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        int first, second, third ;



        if ((a1 > b1) && (a1 > c1) )
            first = a1;
        else if ((b1 > a1) && (b1 > c1 ))
            first = b1;
        else
            first = c1;

        if ((a1 < b1) && (a1 < c1) )
            third = a1;
        else if ((b1 < a1) && (b1 < c1 ))
            third = b1;
        else
            third = c1;

        if ((a1 < first) && (a1 > third))
            second = a1;
        else if ((b1 < first) && (b1 > third))
            second = b1;
        else
            second = c1;

        System.out.println(first + " " + second + " " + third );




    }
}



