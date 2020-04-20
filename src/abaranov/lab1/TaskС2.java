package abaranov.lab1;

import java.util.Scanner;

public class TaskС2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = s.nextInt();
        int b = s.nextInt();
        int result = a + b;
        String d = Integer.toBinaryString(a);
        String e = Integer.toBinaryString(b);
        String f = Integer.toOctalString(a);
        String g = Integer.toOctalString(b);
        String j = Integer.toHexString(a);
        String i = Integer.toHexString(b);
        String convert2 = Integer.toBinaryString(result);
        String convert8 = Integer.toOctalString(result);
        String convert16 = Integer.toHexString(result);
        System.out.println("Dec " + a + "+" + b + "=" + result);
        System.out.println("Bin " + d + "+" + e + "=" + convert2);
        System.out.println("Oct " + f + "+" + g + "=" + convert8);
        System.out.println("Hex " + j + "+" + i + "=" + convert16);
        }
    }
