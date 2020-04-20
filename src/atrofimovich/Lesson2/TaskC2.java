package atrofimovich.Lesson2;

import java.util.Scanner;

public class TaskC2{
    public static void main(String[] args){
        System.out.println("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Сумма введённых вами чисел равна DEC: " + c);
        System.out.println("Сумма введённых вами чисел равна BIN: " + Integer.toBinaryString(c));
        System.out.println("Сумма введённых вами чисел равна HEX: " + Integer.toHexString(c));
        System.out.println("Сумма введённых вами чисел равна OCT: " + Integer.toOctalString(c));
    }
}