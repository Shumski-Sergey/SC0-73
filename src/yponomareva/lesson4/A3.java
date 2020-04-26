package yponomareva.lesson4;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите три целых числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a == b) && (b == c)) {
            System.out.print(a + " " + b + " " + c);
        } else if (a == b){
            System.out.print(a + " " + b);
        } else if (b == c) {
            System.out.print(b + " " + c);
        } else if (a == c){
            System.out.print(a + " " + c);
        } else {
            System.out.print("Здесь нет одинаковых чисел");
        }
    }
}
