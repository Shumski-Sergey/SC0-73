package atrofimovich.Lesson5;

import java.io.*;
import java.util.Arrays;

public class TaskB2 {
    public static void main(String[] args) throws IOException {
        int numberOne = 20;
        int[] array = new int[numberOne];
        System.out.println("Введите 20 целых чисел:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            int b = Integer.parseInt(s);
            array[i] = b;
        }
        int numberTwo = 10;
        int[] a = new int[numberTwo];
        int[] b = new int[numberTwo];
        for (int i = 0; i < a.length; i++) {
            a[i] = array[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = array[i+10];
        }
        System.out.println("Первая половина большого массива:\n".concat("a = " + Arrays.toString(a)));
        System.out.println("Вторая половина большого массива:\n".concat("b = " + Arrays.toString(b)));
    }
}