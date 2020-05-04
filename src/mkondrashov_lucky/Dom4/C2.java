package mkondrashov_lucky.Dom4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        System.out.println("Введите 20 чисел:");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            String a = sc.nextLine();
            if (a.isEmpty()) break;
            list.add(Integer.parseInt(a));
        } while (list.size()<20);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.print("Ваши числа в убывающем порядке: "+list);
    }
}
