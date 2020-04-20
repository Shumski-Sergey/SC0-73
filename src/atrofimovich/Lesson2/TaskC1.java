package atrofimovich.Lesson2;

import java.util.Scanner;

public class TaskC1{
    public static void main(String[] args){
        System.out.println("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Сумма введённых вами чисел равна: " + c);
    }
}