package akot.Lesson4.A;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("понедельник"); break;
            case 2: System.out.println("вторник"); break;
            case 3: System.out.println("среда"); break;
            case 4: System.out.println("четверг"); break;
            case 5: System.out.println("пятница"); break;
            case 6: System.out.println("суббота"); break;
            case 7: System.out.println("воскресенье"); break;
            default: System.out.println("такого дня недели не существует"); break;
        }
    }
}
