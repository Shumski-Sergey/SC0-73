package akot.Lesson3.C;

import java.util.Scanner;

public class TaskC1 {
    public static double TF (int TC) {
        double TF = 32 + (9 * TC /5);
        return TF;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите температуру в градусах Цельсия.");
        int TC = sc.nextInt ();
        System.out.println("Температура в градусах Форенгейта = " + TF (TC));
    }
}
