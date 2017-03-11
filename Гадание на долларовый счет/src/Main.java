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


        int i = 1;
        int k = 1;
        while (k <= 10) {
            while (i <= 10) {
                System.out.print("S");
                i++;
            }
            System.out.println();
            k++;
            i = 1; // Возвращаем i изначальное значение, чтоб снова отрисовывалась строка
        }
    }
}

