package atrofimovich.Lesson5;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int a = 10;
        int[] array = new int[a];
        System.out.println("Введите 10 целых чисел массива:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int b = sc.nextInt();
            array[i] = b;
        }
        System.out.println("Элементы массива в обратном порядке:");
        for (int j = array.length-1; j>=0; j--) {
            System.out.println(array[j] + " ");
        }
    }
}
