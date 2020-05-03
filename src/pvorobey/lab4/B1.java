package pvorobey.lab4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if (x%4==0) {
            if (x%100==0) {
                if (x % 400 == 0)
                    { System.out.println("Год  высокоской"); }
                else
                    { System.out.println("Год не высокосный"); }
                }
            else { System.out.println("Год высокосный");}
        }
        else {System.out.println("Год не высокосный");}
    }
}