package yponomareva.lesson3;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четырехзначное число: ");
        int newNumber = sc.nextInt();
        int sumDigitsNewNumber = sumDigitsInNumber(newNumber);
        System.out.print("Cумма цифр этого числа: " + sumDigitsNewNumber);
    }

    public static int sumDigitsInNumber(int number) {
        String numb = Integer.toString(number);
        int sumSymbol = 0;
        for (int i = 0; i < 4; i++) {
            char symbol = numb.charAt(i);
            sumSymbol += Character.digit(symbol, 10);
        }
        return sumSymbol;

    }
}
