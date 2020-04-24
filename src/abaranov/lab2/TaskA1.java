package abaranov.lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два целых числа ");
        int  a = s.nextInt();
        int  b = s.nextInt();
        int sum = a + b;
        int raznost = a - b;
        int proizv = a * b;
        int delen = a/b;
        int ostatok = a%b;
        double sum1 = a + b;
        double raznost1 = a - b;
        double proizv1 = a * b;
        double delen1 = (double)a/b;
        double ostatok1 = a%b;
        System.out.println(sum + " " + raznost + " " + proizv + " " + delen + " " + ostatok);
        System.out.println();
        System.out.println(sum1 + " " + raznost1 + " " + proizv1 + " " + delen1 + " " + ostatok1);
        }
}
