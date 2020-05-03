package pvorobey.lab3;

import java.util.Scanner;

public class A1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k=a+b, n=a-b, l=a*b, m=a/b, o=a%b;
        System.out.println("Сумма="+k+" "+"Разность="+n+" "+"Произведение="+l+" "+"Частное="+m+" "+"Остаток от деления="+o);
        double x, y;
        x=a;
        y=b;
        double w=x+y, r=x-y, t=x*y, g=x/y, h=x%y;
        System.out.println("Сумма="+w+" "+"Разность="+r+" "+"Произведение="+t+" "+"Частное="+g+" "+"Остаток от деления="+h);
    }
}
