package abaranov.lab1;

import java.util.Scanner;

public class TaskС1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = s.nextInt();
        int b = s.nextInt();
        int result = a + b;
        System.out.println("Сумма этих чисел равна " + result);
        }
    }
