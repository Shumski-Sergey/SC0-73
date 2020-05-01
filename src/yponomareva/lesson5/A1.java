package yponomareva.lesson5;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 10 целых чисел: ");
        int[] array = new int[10];
        for (int i = 0;i < array.length;i++) {
            array[i] = sc.nextInt();
        }
        for (int i = array.length - 1;i >= 0;i--) {
            System.out.println(array[i]);
        }
    }
}
