package mkondrashov_lucky.Dom2;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.println("Введите три константы: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        if (a == 0 | b == 0) {
            System.out.println("У вас неподходящее выражение для поиска дискриминанта, попробуйте снова");
            }
        else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b + Math.pow(D, 0.5));
                double x2 = (-b - Math.pow(D, 0.5));
                System.out.println("Ваши корни равны: " + x1 + " " + x2);
            }
            if (D == 0) {
                double x = (-b/(2 * a));
                System.out.println("Ваш корень равен: " + x);
            }
            if (D < 0) {
                System.out.println("Вещественных корней нет");
            }
        }
    }
}



