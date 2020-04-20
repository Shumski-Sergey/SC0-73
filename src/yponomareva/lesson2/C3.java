package yponomareva.lesson2;

import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес на Земле: ");
        int weightEarth = sc.nextInt();
        double weightMars = getWeight(weightEarth);

        System.out.println("Вес этого тела на Марсе: " + weightMars );
    }
    public static double getWeight(int a) {
        double b = a * 9.81 / 3.86;
        b = b * 100;
        int c = (int)Math.round(b);
        b = (double) c / 100;
        return b;
    }
}
