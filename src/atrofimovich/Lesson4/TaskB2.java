package atrofimovich.Lesson4;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность таблицы умножения:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0 || size > 10) {
            System.out.println("Вы ввели неверное значение!");
        } else {
            int a = 1;
            int b = 1;
            while (b <= size) {
                while (a <= size) {
                    System.out.print(a * b + " ");
                    a++;
                }
                System.out.println(" ");
                a -= size;
                b++;
            }
        }
    }
}