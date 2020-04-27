package atrofimovich.Lesson4;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа для сравнения!");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите первое число:");
        a = sc.nextInt();
        System.out.println("Введите второе число:");
        b = sc.nextInt();
        System.out.println("Введите третье число:");
        c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else {
            System.out.println("Среди введённых чисел равных нет!");
        }
    }
}
