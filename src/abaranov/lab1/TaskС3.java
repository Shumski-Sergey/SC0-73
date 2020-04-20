package abaranov.lab1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaskС3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        System.out.println("Введите вес человека на Земле в кг ");
        a = s.nextInt();
        System.out.println(getWeight(a));
    }
        public static double getWeight(double weightEarth) {
            double a = weightEarth;
            double b = (3.86/9.81)*a;
            double weightMars = new BigDecimal(b).setScale(2, RoundingMode.UP).doubleValue();
            System.out.println("Вес человека на Марсе в кг ");
            return weightMars;
    }
    }
