package atrofimovich.Lesson5;

import java.io.*;
import java.util.ArrayList;

public class TaskC1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 20 целых чисел:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listFirst = new ArrayList<>();
        ArrayList<Integer> listDivTwo = new ArrayList<>();
        ArrayList<Integer> listDivThree = new ArrayList<>();
        ArrayList<Integer> listAnother = new ArrayList<>();
        int a = 20;
        for (int i = 0; i < a; i++) {
            String s = reader.readLine();
            int b = Integer.parseInt(s);
            listFirst.add(b);
        }
        for (Integer x : listFirst) {
            if (x % 6 == 0) {
                listDivTwo.add(x);
                listDivThree.add(x);
            }
            else if (x % 2 == 0) listDivTwo.add(x);
            else if (x % 3 == 0) listDivThree.add(x);
            else listAnother.add(x);
        }
        System.out.println("Элементы списка, кратные 3 и/или 6:");
        printList(listDivThree);
        System.out.println("Элементы списка, кратные 2 и/или 6:");
        printList(listDivTwo);
        System.out.println("Оставшиеся элементы списка (простые числа):");
        printList(listAnother);
    }

    private static void printList(ArrayList<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}