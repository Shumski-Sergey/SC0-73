package atrofimovich.Lesson4;

import java.util.Scanner;
public class TaskA2 {
    public static void main(String[] args){
        System.out.println("Введите номер дня недели:");
        Scanner sc = new Scanner(System.in);
        int weekday = sc.nextInt();
        if(weekday<=0 || weekday>=8){
            System.out.println("Такого дня недели не существует!");
        }
        else{
            switch (weekday) {
                case 1 -> System.out.println("Понедельник!");
                case 2 -> System.out.println("Вторник!");
                case 3 -> System.out.println("Среда!");
                case 4 -> System.out.println("Четверг!");
                case 5 -> System.out.println("Пятница!");
                case 6 -> System.out.println("Суббота!");
                case 7 -> System.out.println("Воcкресенье!");
            }
        }
    }
}
