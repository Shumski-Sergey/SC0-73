package akot.Lesson5.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskB2 {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int [] m = new int [20];
        System.out.println("Введите массив из 20 целых чисел");
        for (int i = 0; i < m.length; i ++) {
            String c = reader.readLine();
            m [i] = Integer.parseInt(c);
        }
        int [] a = new int [10];
        int [] b = new int [10];
        for (int i = 0; i < m.length; i ++) {
            if (i < m.length/2) {
                a [i] = m [i];
            }
            else {
                b [i - m.length/2] = m [i];
            }
        }
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        }
    }
