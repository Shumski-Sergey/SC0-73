package yponomareva.lesson3;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double disc = dis(a, b, c);

        if(disc == 0) {
            double x = -b / (2*a);
            System.out.println("Результат: " + x);
        } else if(disc<0) {
            System.out.println("Отрицательный дискриминант");
        } else {
            double x1 = (-b + Math.sqrt(disc)) / (2*a);
            double x2 = (-b - Math.sqrt(disc)) / (2*a);
            System.out.println("Результат: " + x1 + " " + x2);
        }
    }

     public static double dis(int aa, int bb, int cc) {
        double dd = (bb*bb - 4*aa*cc);
        return dd;
     }

}
