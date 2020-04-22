package yponomareva.lesson3;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int f = a * b;
        int g = a / b;
        int i = a % b;

        double q = a + b;
        double w = a - b;
        double e = a * b;
        double r = a / (double)b;
        double t = a % b;

        System.out.println(c + " " + d + " " + f + " " + g + " " + i);
        System.out.println(q + " " + w + " " + e + " " + r + " " + t);
    }
}
