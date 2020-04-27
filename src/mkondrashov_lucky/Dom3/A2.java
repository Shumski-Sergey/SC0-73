package mkondrashov_lucky.Dom3;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args)  {
        System.out.println("Введите номер дня недели: ");
        Scanner sc = new Scanner(System.in);
        byte i = sc.nextByte();
        switch (i) {
            case 1: System.out.println("Это понедельник"); break;
            case 2: System.out.println("Это вторник"); break;
            case 3: System.out.println("Это среда"); break;
            case 4: System.out.println("Это четверг"); break;
            case 5: System.out.println("Это пятница"); break;
            case 6: System.out.println("Это суббота"); break;
            case 7: System.out.println("Это воскресенье"); break;
            default: System.out.println("Неверный день недели");
        }
    }
}
