package yponomareva.lesson4;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        int sum = 1;
        int i = 2;
        while (sum<=a) {
            System.out.print(sum + ",");
            sum+=i;
            i++;
        }
    }
}
