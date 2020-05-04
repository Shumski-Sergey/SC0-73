package mkondrashov_lucky.Dom4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class B2 {
    public static void main(String[] args) {
        System.out.println("Введите 20 чисел: ");
        ArrayList<Integer> Big = new ArrayList<>();
        ArrayList<Integer> SmallOne = new ArrayList<>();
        ArrayList<Integer> SmallTwo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            String a = sc.nextLine();
            if (a.isEmpty()) break;
            Big.add(Integer.parseInt(a));
        } while (Big.size()<20);
        AtomicInteger count = new AtomicInteger();
        int mid = Big.size()/2;
        Big.forEach(next -> {
            int index = count.getAndIncrement();
            if (index<mid) SmallOne.add(next);
            else SmallTwo.add(next);
        });
        System.out.println("Первая половина: "+SmallOne);
        System.out.println("Вторая половина: "+SmallTwo);
    }
}

