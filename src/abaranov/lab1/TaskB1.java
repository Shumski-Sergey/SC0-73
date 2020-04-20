package abaranov.lab1;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int a;
        System.out.println("Введите целое число ");
       a = s.nextInt();
        int result = a*a;
        System.out.println("Квадрат этого числа равен " + result);
        }
    }
