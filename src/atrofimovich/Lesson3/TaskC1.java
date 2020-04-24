package atrofimovich.Lesson3;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args){
        System.out.println("Введите значение температуры в градусах Цельсия, °C:");
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        double b = convertCelsiumToFahrenheit(a);
        System.out.println(b);
    }
    private static double convertCelsiumToFahrenheit(int celsium){
        return celsium * 1.8 + 32;
    }
}
