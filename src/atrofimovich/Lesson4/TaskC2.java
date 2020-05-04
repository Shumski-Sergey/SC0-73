package atrofimovich.Lesson4;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int a = 30;
        System.out.println("Введите день и месяц 2018 года!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день 2018 года:");
        int number = sc.nextInt();
        if (number < 1 || number > 31) return;
        System.out.println("Введите месяц 2018 года (число):");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("Это день года № " + number);
                break;
            case 2:
                System.out.println("Это день года № " + ((a + 1) + number));
                break;
            case 3:
                System.out.println("Это день года № " + ((2 * a - 1) + number));
                break;
            case 4:
                System.out.println("Это день года № " + (3 * a + number));
                break;
            case 5:
                System.out.println("Это день года № " + (4 * a + number));
                break;
            case 6:
                System.out.println("Это день года № " + ((5 * a + 1) + number));
                break;
            case 7:
                System.out.println("Это день года № " + ((6 * a + 1) + number));
                break;
            case 8:
                System.out.println("Это день года № " + ((7 * a + 2) + number));
                break;
            case 9:
                System.out.println("Это день года № " + ((8 * a + 3) + number));
                break;
            case 10:
                System.out.println("Это день года № " + ((9 * a + 3) + number));
                break;
            case 11:
                System.out.println("Это день года № " + ((10 * a + 4) + number));
                break;
            case 12:
                System.out.println("Это день года № " + ((11 * a + 4) + number));
                break;
        }
    }
}
