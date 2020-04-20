package yponomareva.lesson2;

import java.util.Scanner;

public class С2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("Вывод: ");
        System.out.println("DEC: " + a + "+" + b + "=" + c);
        System.out.println("BIN: " + Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(c));
        System.out.println("HEX: " + Integer.toHexString(a) + "+" + Integer.toHexString(b) + "=" + Integer.toHexString(c));
        System.out.println("OCT: " + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(c));
    }
}
