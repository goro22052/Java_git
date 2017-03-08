/*
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
«количество отрицательных чисел: а», «количество положительных чисел: б»,
где а, б — искомые значения.

Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        int a = 0;
        int b = 0;

        if ((n1 > 0) && (n1 != 0)) a++;
        if ((n1 < 0) && (n1 != 0)) b++;
        if ((n2 > 0) && (n2 != 0)) a++;
        if ((n2 < 0) && (n2 != 0)) b++;
        if ((n3 > 0) && (n3 != 0)) a++;
        if ((n3 < 0) && (n3 != 0)) b++;

        System.out.println("количество отрицательных чисел: " + b);
        System.out.println("количество положительных чисел: " + a);
    }

}
