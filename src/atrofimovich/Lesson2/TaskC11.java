package atrofimovich.Lesson2;

import java.util.Scanner;

public class TaskC11{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите второе число:");
        int b = sc2.nextInt();
        int c = a + b;
        System.out.println("Сумма введённых вами чисел равна: " + c);
    }
}