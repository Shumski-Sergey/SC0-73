package yponomareva.lesson2;

import java.util.Scanner;

import static java.lang.System.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = sc.nextInt();
        int b = a * a;

        System.out.println("Your number squared: " + b);
        //sc.close();
    }
}
