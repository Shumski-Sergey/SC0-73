package atrofimovich.Lesson2;

import java.util.Scanner;

public class TaskC31{
    public static void main(String[] args){
        System.out.println("Введите массу человека, кг:");
        double a = getWeight();
        a *= 100;
        int b = (int)Math.round(a);
        a = (double)b/100;
        System.out.println("Вес человека на Марсе равен: " + a + " Ньютон(-а)");
    }

    public static double getWeight(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = 3.86;
        a *= b;
        return a;
    }
}