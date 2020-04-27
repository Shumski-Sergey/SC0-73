package abaranov.lab3;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int a1 = year % 4;
        int a2 = year % 400;
        int a3 = year % 100;
        if (a1 != 0 || (a3 == 0 && a2 !=0)) {
            System.out.println("количество дней в году: 365");
        }
        else
            System.out.println("количество дней в году: 366");
    }

}
