package akot.Lesson4.B;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int mod1 = a % 4;
        int mod2 = a % 100;
        int mod3 = a % 400;
        if (mod1 > 0 || (mod2 == 0 && mod3 > 0)) {
            System.out.println("количество дней в году: " + 365);
        }
        else
            System.out.println("количество дней в году: " + 366);
    }
}
