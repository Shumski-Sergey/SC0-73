package yponomareva.lesson4;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int x = sc.nextInt();

        if (x%4 == 0) {
            if((!(x%400 == 0)) && (x%100 == 0)) {
                System.out.println("Количество дней в году: 365");
            }else {
                System.out.println("Количество дней в году: 366");
            }
        }else {
            System.out.println("Количество дней в году: 365");
        }

        //другой вид:
/*        if ((x%4 == 0) && !((!(x%400 == 0)) && (x%100 == 0))) {
            System.out.println("Количество дней в году: 366");
        }else {
            System.out.println("Количество дней в году: 365");
        }
*/
    }
}
