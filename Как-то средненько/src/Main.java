import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 Как-то средненько
 Ввести с клавиатуры три числа, вывести на экран среднее из них.
 Т.е. не самое большое и не самое маленькое.
 Если все числа равны, вивести любое из них.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Ведите первое число: ");
        int a = Integer.parseInt(reader.readLine());

         System.out.print("Ведите второе число: ");
        int b = Integer.parseInt(reader.readLine());

         System.out.print("Ведите третье число: ");
        int c = Integer.parseInt(reader.readLine());


        if (((a >= b ) && (a <= c)) || ((a <= b ) && (a >= c)))
        {
            System.out.println(a);
        }

        else if (((b >= a) && (b <= c)) || ((b <= a) && (b >= c)))
        {
            System.out.println(b);
        }
        else if (((c >= a) && (c <= b)) || ((c <= a) && (c >= b)))
        {
            System.out.println(c);
        }



    }

}
