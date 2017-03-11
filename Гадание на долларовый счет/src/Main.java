/**
 Гадание на долларовый счет
 Вывести на экран квадрат из 10х10 букв S используя цикл while.
 Буквы в каждой строке не разделять.

 Пример вывода на экран:
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 */
public class Main {
    public static void main(String[] args) throws Exception {


        int i = 0;
        while ( i < 10)
        {
            for (int j = 1; j <= 10; j++ )
            {
                System.out.print("S");
            }

            System.out.println();
            i++;
        }

    }

}

