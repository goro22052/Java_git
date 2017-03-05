import java.io.*;

/*
Три числа
Ввод с клавиатуры, сравнение чисел и вывод на экран — у студентов 4 уровня секретного центра JavaRush эти навыки оттачиваются до автоматизма.
Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры. Затем происходит сравнение, и если мы находим число, которое отличается от двух других, выводим на экран его порядковый номер.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число а: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Введите число b: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Введите число c: ");
        int c = Integer.parseInt(reader.readLine());

        int n = 0;

        if ((a == b) && (b == c))
            return;
        else if ((a != b) && (b == c)) n = 1;
        else if ((b != a) && (a == c)) n = 2;
        else if ((c != a) && (a == b)) n = 3;
        else if ((a != b && (a != c) && (b != c))) return;

        System.out.println(n);
    }
}






