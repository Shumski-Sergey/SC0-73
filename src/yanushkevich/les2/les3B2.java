package yanushkevich.les2;

import java.util.Scanner;

public class les3B2 {
    public static void main(String[] args) {
        System.out.println(" Ввод : ");
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(" Вывод :" + "\n" + x1 + " " + x2);
        } else if (D == 0) {
            double x = (-b >> 1) * a;
            System.out.println(" Вывод :" + "\n" + x);
        } else if (D < 0) {
            System.out.println("Отрицательный дискриминант");
        }
    }
}
