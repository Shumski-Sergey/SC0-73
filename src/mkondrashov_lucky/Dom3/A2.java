package mkondrashov_lucky.Dom3;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args)  {
        System.out.println("Введите номер дня недели: ");
        Scanner sc = new Scanner(System.in);
        byte i = sc.nextByte();
        switch (i) {
            case 1 -> System.out.println("Это понедельник");
            case 2 -> System.out.println("Это вторник");
            case 3 -> System.out.println("Это среда");
            case 4 -> System.out.println("Это четверг");
            case 5 -> System.out.println("Это пятница");
            case 6 -> System.out.println("Это суббота");
            case 7 -> System.out.println("Это воскресенье");
            default -> System.out.println("Неверный день недели");
        }
    }
}
