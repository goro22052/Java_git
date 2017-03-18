import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 Суммирование
 Вводить с клавиатуры числа и считать их сумму.
 Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;

        for (int i = 0; i != -1;)
        {
            i = Integer.parseInt(reader.readLine());
            sum+=i;
        }
        System.out.println(sum);

    }
}
