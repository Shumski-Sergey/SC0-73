package mkondrashov_lucky.Dom3;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        System.out.println("Ведите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; true; i++){
            sum = sum +i;
            if (a>=sum) System.out.print(sum+",");
            else break;
        }
    }
}
