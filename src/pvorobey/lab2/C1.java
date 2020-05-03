package pvorobey.lab2;

import java.util.Scanner;
public class C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int Sum=a+b;
        System.out.println("Sum"+"="+(a+b));
    }
}