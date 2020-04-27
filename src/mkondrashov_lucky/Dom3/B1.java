package mkondrashov_lucky.Dom3;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println("Введите интересующий год: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%400==0 || (a%100!=0 && a%4==0)){
            System.out.println("Введенный год високосный, кол-во дней: 366");
        } else System.out.println("Введенный год обыкновенный, кол-во дней: 365");
    }
}
