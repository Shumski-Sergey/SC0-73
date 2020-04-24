package atrofimovich.Lesson3;

import java.util.Scanner;

public class TaskB1{
    public static void main(String[] args){
        System.out.println("Введите три целых числа:");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d = dis(a, b, c);
        if (d>0){
            double x1=(-b+d)/(2*a);
            double x2=(-b-d)/(2*a);
            System.out.println("Значение первого корня равно: " + x1 + "\n" + "Значение второго корня равно: " + x2);
        }
        else if (d==0){
            double x1=(-b+d)/(2*a);
            double x2=(-b-d)/(2*a);
            System.out.println("Значение первого корня равно: " + x1 + "\n" + "Значение второго корня равно: " + x2);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней");
        }
           }

    private static double dis(int a, int b, int c){
        return Math.sqrt(b*b-4*a*c);
    }
}