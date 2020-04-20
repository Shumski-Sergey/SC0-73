package mkondrashov_lucky;

import java.math.BigInteger;
import java.util.Scanner;

public class Dom1 {
        public static void main(String[] args) {

        //Level A
            //TaskA1
            System.out.println("Hello World");

            //TaskA2
            String s1 = " Я начинаю изучать Джава";
            System.out.println(s1+s1+s1+s1+s1);

            //TaskA3
            int a = 3;
            int b = 4;
            int c = a*a+b*b;
            System.out.println(a+"*"+a+"+"+b+"*"+b+"="+c);

        //Level B
            //TaskB1
            System.out.println("Введите в консоль число для получения его квадрата:");
            Scanner sc = new Scanner(System.in);
            int a1 = sc.nextInt();
            System.out.println("Ваш ответ: "+a1*a1);

            //TaskB2
            int z1 = 1;
            int z2 = 3;
            int z3 = 9;
            int z4 = 27;
            int result =-z1+z2-z3+z4;
            System.out.println("Результат: "+result);

            //TaskB3 (странное задание)
            //String s = "С";
            System.out.println("Новым Годом");

        //Level C
            //TaskC1
            System.out.println("Введите в консоль два числа для получения из суммы:");
            Scanner sc1 = new Scanner(System.in);
            int x1 = sc1.nextInt();
            int x2 = sc1.nextInt();
            System.out.println("Ваш ответ: "+(x1+x2));

            //TaskC2
            System.out.println("Введите в консоль два числа для получения из суммы в разных системах счисления: ");
            Scanner sc2 = new Scanner(System.in);
            int x3 = sc2.nextInt();
            int x4 = sc2.nextInt();
            System.out.println("DEC: "+(x3+x4));
            System.out.println("BIN: "+(new BigInteger(new BigInteger(String.valueOf(x3)).toString(2),2)));


        }
}
