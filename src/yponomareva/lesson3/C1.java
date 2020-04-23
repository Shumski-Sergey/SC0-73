package yponomareva.lesson3;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру по Цельсию: ");
        int celsius = sc.nextInt();
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Температура по Фаренгейту: " + fahrenheit);
    }

    public static double convertCelsiusToFahrenheit(int celsiusDegree) {
        double fahrenheitDegree = (celsiusDegree * 1.8) + 32;
        return fahrenheitDegree;
    }
}
