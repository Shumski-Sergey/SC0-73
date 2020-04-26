package akot.Lesson4.B;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
            for (int i = 1; true; i ++) {
                sum = sum + i;
                if (a >= sum) {
                    System.out.print(sum + ",");
                }
                else {
                    break;
                    }
                }
            }
        }
