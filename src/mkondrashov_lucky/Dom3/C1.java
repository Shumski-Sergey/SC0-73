package mkondrashov_lucky.Dom3;

//Я не понял к чему в этом задании указания месяцев от 0 до 14,
//если к ним никогда по заданию не обращаются,
//поэтому я их опустил

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите себе зарплату: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        if (a>=300 && a<=3000){
            String [] months = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь" };
            for (String x:months){
                System.out.println("Ваша зарплата в месяце "+x+" = "+a+" + премия "+a*0.5+" $");
            }
        } else System.out.println("Мы вам перезвоним!");
    }
}
