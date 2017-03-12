/*
 Письмо счастья
 Ввести с клавиатуры имя и используя цикл for 10 раз вывести: «*имя* любит меня.»

 Пример вывода на экран для имени Света:
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 Света любит меня.
 */
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите имя: ");
        String name = reader.readLine();

        for (int i = 0; i < 10; i++)
        {
            System.out.println( name + " любит меня.");
        }
    }
}
