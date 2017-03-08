/*
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.

Пример для чисел -4 6 6:
2

Пример для чисел -6 -6 -3:
0
 */

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе  число: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());

        boolean n1 = a > 0;
        boolean n2 = b > 0;
        boolean n3 = c > 0;

        if (n1 && n2 && n3) System.out.println("3");
        else if ((!n1 && n2 && n3) || (n1 && !n2 && n3) || (n1 && n2 && !n3) ) System.out.println("2");
        else if ((!n1 && !n2 && n3) || (!n1 && n2 && !n3) && (n1 && !n2 && !n3)) System.out.println("1");
        else System.out.println("0");


    }
}
