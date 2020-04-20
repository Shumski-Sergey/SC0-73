package ktsyvis;
/*
Нужно написать программу, которая вводит два числа с клавиатуры и 4 раза выводит их сумму
 с обозначением системы счисления на экран в десятичном двоичном шестнадцатиричном восьмиричном виде
 */

import java.util.Scanner;

public class L2task8 {
    public static void main(String[] args) {
        System.out.print("Введите два целых числа: ");
        Scanner scan  = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + num1 + "+" + num2 + "=" +(sum));
        System.out.println("Sum = " + Integer.toBinaryString(num1) + "+" + Integer.toBinaryString(num2) + "="
                + Integer.toBinaryString(sum));
        System.out.println("Sum = " + Integer.toHexString(num1).toUpperCase()+ "+" + Integer.toHexString(num2).toUpperCase()
                + "=" + Integer.toHexString(sum).toUpperCase());
        System.out.println("Sum = " + Integer.toOctalString(num1) + "+" + Integer.toOctalString(num2) + "=" + Integer.toOctalString(sum));

    }

}
