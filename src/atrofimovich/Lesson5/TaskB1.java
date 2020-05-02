package atrofimovich.Lesson5;

import java.io.*;
import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 5 строк:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        System.out.println("Размер списка строк равен: "+ list.size());
        System.out.println("Содержимое списка строк:");
        for (String s: list){
            System.out.println(s);
        }
    }
}