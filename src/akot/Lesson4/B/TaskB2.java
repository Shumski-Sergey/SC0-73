package akot.Lesson4.B;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность таблицы умножения");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int i = 1;
        int j = 1;
        while (i <= size && j <= size) {
            System.out.print((i * j) + " " );
            if (i == size) {
                System.out.println();
                j += 1;
                i = 0;
            }
            i ++;
        }
    }
}
