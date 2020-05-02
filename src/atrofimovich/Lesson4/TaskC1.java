package atrofimovich.Lesson4;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какая зарплата вас бы устроила?");
        Scanner sc = new Scanner(System.in);
        int ilike$ = sc.nextInt();
        if (ilike$ < 300 || ilike$ > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int month = 0; month < 15; month++) {
                double result$ = ilike$ * 1.5;
                if (month == 0 || month == 13 || month == 14) {
                    System.out.println("Ваша зарплата в этом месяце составила: $0.0");
                } else if (month < 6 || month > 8) {
                    System.out.println("Ваша зарплата в этом месяце составила: $" + result$);
                } else {
                    switch (month) {
//                        case 6 -> System.out.println("Ваша зарплата в этом месяце составила: июнь $" + ilike$);
//                        case 7 -> System.out.println("Ваша зарплата в этом месяце составила: июль $" + ilike$);
//                        case 8 -> System.out.println("Ваша зарплата в этом месяце составила: август $" + ilike$);
                    }
                }
            }
        }
    }
}
//не доделал п. с $666
//if(ilike$ == 666 || result$ == 666) {
//        System.out.println("Ваша зарплата составила: 666$. Вы уволены. Горите в аду!");
//        break;
//        }