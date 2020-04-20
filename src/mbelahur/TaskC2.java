package mbelahur;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        System.out.println("Enter an integer");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + c);
        String convert = Integer.toBinaryString(a);
        String convert2 = Integer.toBinaryString(b);
        String convert3 = Integer.toBinaryString(c);
        System.out.println("BIN:"  + convert + "+" + convert2 + "=" + convert3);
        String convert4 = Integer.toHexString(a);
        String convert5 = Integer.toHexString(b);
        String convert6 = Integer.toHexString(c);
        System.out.println("HEX:" + convert4 + "+" + convert5 + "=" + convert6);
        String convert7 = Integer.toOctalString(a);
        String convert8 = Integer.toOctalString(b);
        String convert9 = Integer.toOctalString(c);
        System.out.println("OKT:" + convert7 + "+" + convert8 + "=" + convert9);


    }
}
