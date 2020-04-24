package atrofimovich.Lesson3;

import java.util.Scanner;

public class TaskA1{
    public static void main(String[] args){
        System.out.println("Введите два целых числа:");
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c = getSum(a, b);
        int d = getDif(a, b);
        int e = getMult(a, b);
        int f = getDiv(a, b);
        int g = getBal(a, b);
        System.out.println(c + " " + d + " " + e + " " + f + " " + g);
        System.out.println((double)c + " " + (double)d + " " + (double)e + " " + (double)f + " " + (double)g);
    }

    private static int getSum(int a, int b){
        return a + b;
    }

    private static int getDif(int a, int b){
        return a - b;
    }

    private static int getMult(int a, int b){
        return a * b;
    }

    private static int getDiv(int a, int b){
        return a / b;
    }

    private static int getBal(int a, int b){
        return a % b;
    }
}