package atrofimovich.Lesson3;

import java.util.Scanner;

public class TaskC2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = sc.nextInt();
        int b = sumDigitsInNumber(a);
        System.out.println("Сумма всех цифр числа равна: " + b);
    }

    private static int sumDigitsInNumber(int number){
        int res = 0;
        while(number != 0){
            res = res + number%10;
            number = number/10;
        }
        return res;
    }
}
