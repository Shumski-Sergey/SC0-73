package abaranov.lab2;

import java.util.Scanner;


// НАДО ДОДЕЛАТЬ ВСЕ ЭТО//
public class TaskB2 {
    public static double dis(int a1, int b1, int c1) {
        double dis = b1 * b1 - 4 * a1 * c1;
        return dis;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double res = dis(a, b, c);
        if (res > 0) {
            double x1 = (-b + Math.sqrt(res)) / (2 * a);
            double x2 = (-b - Math.sqrt(res)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        else if (res == 0) {
            double x1 = -b / (2 * a);
            System.out.println(x1);}
            else if (res < 0) {
                System.out.println("Отрицательный дискриминант");
            }

        }
    }

