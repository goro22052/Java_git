/*
Ярлыки и числа
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число: ");
        String x = reader.readLine();
        int y = Integer.parseInt(x);

        if ((y > 0) && ((y % 2) == 0)) System.out.println("положительное четное число");
        else if ((y > 0) && ((y % 2) > 0)) System.out.println("положительное нечетное число");
        else if ((y < 0) && ((Math.abs(y % 2)) > 0)) System.out.println("отрицательное нечетное число");
        else if ((y < 0) && ((Math.abs(y % 2) == 0))) System.out.println("отрицательное четное число");
        else if (y == 0) System.out.println("ноль");

    }
}


