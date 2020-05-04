package mkondrashov_lucky.Dom4;

import java.util.ArrayList;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        System.out.println("Введите любые слова, чтобы закончить введите слово END: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String a = sc.nextLine();
            if (a.equals("End")||a.equals("end")||a.equals("END")) break;
            list.add(a);
        }
        System.out.println("Ваш вывод: \n"+list);
    }
}
