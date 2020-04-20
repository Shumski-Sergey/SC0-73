package yponomareva.lesson2;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("Вывод: ");
        System.out.print("Sum = " + c);
    }
}
