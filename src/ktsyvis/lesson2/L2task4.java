package ktsyvis.lesson2;
/*
Выводим квадрат числа
НАпишите программу, которая считыавет с клавиатуры целое число а и выводит квадрат этого числа (а * а).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Scanner sc=new Scanner (System.in)
 */

import java.util.Scanner;

public class L2task4 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan  = new Scanner(System.in);  // Create a Scanner object
        int userChoice = scan.nextInt(); // Read user input
        System.out.println("Result: "+ (int)Math.pow(userChoice,2)); // Output user input
    }
}
