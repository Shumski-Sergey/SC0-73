package mkondrashov_lucky.Dom2;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        System.out.println("Введите температуру Цельсия °C: ");
        Scanner sc = new Scanner(System.in);
        double TC = sc.nextInt();
        double TF = ((9*TC/5)+32);
        System.out.println("Температура по Фаренгейту равна: "+TF+"°F");
    }
}
