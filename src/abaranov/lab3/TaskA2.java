package abaranov.lab3;

import java.util.Scanner;

public class TaskA2 {
    public static void main (String[] args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
                break;
        }
    }
}
