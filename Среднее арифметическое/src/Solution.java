import java.io.BufferedReader;
import java.io.InputStreamReader;

/**

 Среднее арифметическое
 Вводить с клавиатуры числа и вычислить среднее арифметическое.
 Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
 -1 не должно учитываться.

 Пример для чисел 1 2 2 4 5 -1:
 2.8

 Пример для чисел 4 3 2 1 -1:
 2.5
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stopper = -1;
        int sum = 0;
        int count = 0;
        float res;


        for (int i = 0; i != stopper;)
        {

            i = Integer.parseInt(reader.readLine());

             sum = i + i;
             count = count++;

        }
        res = (float) sum / (float) count;
        System.out.println(res);


    }
}
