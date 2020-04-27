package yponomareva.lesson4;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте размерность таблицы числом: ");
        int a = sc.nextInt();
        int x = 1;
        while (x<=a) {
            int y=1;
            while (y<=a) {
                System.out.print(x*y + " ");
                y++;
            }
            x++;
            System.out.print("\n");
        }
    }
}
