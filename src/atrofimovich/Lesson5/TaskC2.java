package atrofimovich.Lesson5;

import java.io.*;
import java.util.Arrays;

public class TaskC2 {
    public static void main(String[] args) throws IOException {
        int a = 20, i, j, k;
        int[] array = new int[a];
        System.out.println("Введите 20 целых чисел:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < a; i++) {
            String s = reader.readLine();
            int b = Integer.parseInt(s);
            array[i] = b;
        }
        for (i = 1; i < a; i++){
            for (j = a - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    k = array[j - 1];
                    array[j-1] = array[j];
                    array[j] = k;
                }
            }
        }
        System.out.println("Массив, отсортированный по возрастанию:\n".concat(Arrays.toString(array)));
        for (i = 1; i < a; i++) {
            for (j = 1; j <= a - 1; j++) {
                if (array[j - 1] < array[j]) {
                    k = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = k;
                }
            }
        }
        System.out.println("Массив, отсортированный по убыванию:\n".concat(Arrays.toString(array)));
    }
}