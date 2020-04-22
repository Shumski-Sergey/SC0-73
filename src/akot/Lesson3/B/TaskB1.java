package akot.Lesson3.B;

import java.util.Scanner;

public class TaskB1 {
    public static int dis (int a, int b, int c) {
        int dis = b * b - 4 * a * c;
        return dis;
    }
    double dis;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = dis (a, b, c);
        if (res > 0) {
            double x1 = (- b + Math.sqrt(res)) / (2 * a);
            double x2 = (- b - Math.sqrt(res)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        else if (res == 0) {
            double x1 = - b / (2 * a);
            System.out.println(x1);
        }
        else if (res < 0) {
            System.out.println("Отрицательный дискриминант");
        }
    }
}
