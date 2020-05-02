package atrofimovich.Lesson5;

import java.io.*;
import java.util.ArrayList;

public class TaskA2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку, а затем заключительное слово END:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("END")) {
                break;
            } else {
                list.add(s);
            }
        }
        reader.close();
        System.out.println("Введённый список строк:");
        System.out.print(list);
    }
}