package yponomareva.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("Введите 5 строк: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i < 5;i++) {
            String word = reader.readLine();
            strings.add(word);
        }
        System.out.println("Строки из вашей коллекции: ");
        for (String x: strings) {
            System.out.println(x);
        }
        System.out.print("Размер вашей коллекции: ".concat(String.valueOf(strings.size())));
    }
}
