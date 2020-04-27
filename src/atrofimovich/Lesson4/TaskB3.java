package atrofimovich.Lesson4;

import java.util.Scanner;
public class TaskB3 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;
        int sum1 = 1;
        while(sum1<a){
            sum1 = sum1 + (sum + 1);
            sum++;
            if(sum1<a) {
                System.out.print(sum1 + ",");
            }
        }
    }
}
