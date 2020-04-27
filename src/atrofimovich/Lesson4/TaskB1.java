package atrofimovich.Lesson4;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Введите год:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Вас съел динозавр!");
        } else if (!(a % 4 == 0)) {
            System.out.println("В году 365 дней.\nВведённый вами год не является високосным!");
        } else {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("В году 366 дней.\nВведённый вами год является високосным!");
                } else {
                    System.out.println("В году 365 дней.\nВведённый вами год не является високосным!");
                }
            } else {
                System.out.println("В году 366 дней.\nВведённый вами год является високосным!");
            }
        }
    }
}