package atrofimovich.Lesson2;

import java.util.Scanner;

public class TaskC3{
    public static void main(String[] args){
        System.out.println("Введите массу человека, кг:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = 3.86;
        a=a*b;
        System.out.println("Вес человека на Марсе равен: " + a + " Ньютон");
    }
}