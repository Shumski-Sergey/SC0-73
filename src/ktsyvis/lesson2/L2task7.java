package ktsyvis.lesson2;
/*
Нужно написать программу, которая вводит два числа с клавиатуры и выводит сумму на экран в виде
Ввод:
34 26
Sum = 26
 */

import java.util.Scanner;

public class L2task7 {
    public static void main(String[] args) {
        System.out.print("Введите два любых числа: ");
        Scanner scan  = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}