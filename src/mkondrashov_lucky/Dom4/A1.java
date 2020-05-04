package mkondrashov_lucky.Dom4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        System.out.println("Введите любые числа: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            String a = sc.nextLine();
            if (a.isEmpty()) break;
            list.add(Integer.parseInt(a));
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("Отсортированные числа: ");
        for (int b: list) System.out.print(b+" ");
    }
}
