package mkondrashov_lucky.Dom3;

import java.util.Scanner;

public class A3 {
    public static void main(String [] args){
        System.out.println("Введите 3 числа на свой выбор: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && b==c) System.out.println(a + " " + b + " " + c);
        else {
            if (a == b) System.out.println(a + " " + b);
            else {
                if (a == c) System.out.println(a + " " + c);
                else {
                    if (b == c) System.out.println(b + " " + c);
                    else System.out.println("Совпадений не найдено");
                }
            }
        }
    }
}
