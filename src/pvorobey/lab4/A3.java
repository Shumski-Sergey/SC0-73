package pvorobey.lab4;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a==b && b==c) System.out.println(a+" "+b+" "+c);
        else if (a==c) System.out.println(a+" "+c);
        else if (a==b) System.out.println(a+" "+b);
        else if (b==c) System.out.println(b+" "+c);
    }
}
