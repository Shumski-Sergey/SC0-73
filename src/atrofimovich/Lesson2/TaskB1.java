package atrofimovich.Lesson2;

import java.util.Scanner;

public class TaskB1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        System.out.println("Квадрат введённого вами числа равен: " + a*a);
        if(a % 2 == 0){
            System.out.println("Введённое вами число является чётным");
        }else{
            System.out.println("Введённое вами число является нечётным");
        }
    }
}