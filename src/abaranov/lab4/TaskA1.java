package abaranov.lab4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskA1 {
     public static void main (String[] args ) {
         int mas[] = new int [10];
         System.out.println("Введите 10 целых чисел:");
         Scanner s = new Scanner(System.in);
         for (int i = 0; i < mas.length; i++) {
             mas[i] = s.nextInt();
         }
         System.out.println("Элементы массива в обратном порядке");
         for (int i = mas.length-1; i >= 0; i--) {
             System.out.println(mas[i]);

         }

        }
}
