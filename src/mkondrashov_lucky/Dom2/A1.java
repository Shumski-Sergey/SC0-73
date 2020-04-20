package mkondrashov_lucky.Dom2;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args){
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Полученные сумма, разность, произведение, частное, остаток от деления в инт: "
        +(a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
        double c, d;
        c = a;
        d = b;
        System.out.println("Полученные сумма, разность, произведение, частное, остаток от деления в дабл: "
        +(c+d)+" "+(c-d)+" "+(c*d)+" "+(c/d)+" "+(c%d));
    }
}
