import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 Хорошего много не бывает
 Ввести с клавиатуры строку и число N.
 Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

 Пример ввода:
 абв
 2

 Пример вывода:
 абв
 абв
 */
public class Main {


    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку: ");
        String s = reader.readLine();

        System.out.println("Введите число: ");
        int n = Integer.parseInt(reader.readLine());
        int i = 0;

        while (i < n)
        {
            System.out.println(s);
            i++;
        }

        }

}