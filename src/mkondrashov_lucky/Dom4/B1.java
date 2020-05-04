package mkondrashov_lucky.Dom4;

import java.util.ArrayList;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println("Введите до 5 любых строк: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        do {
            String a = sc.nextLine();
            if (a.isEmpty()) break;
            list.add(a);
        } while (list.size() < 5);
        System.out.println("Число введенных слов: "+list.size());
        for (String b: list) System.out.println(b);
    }
}
