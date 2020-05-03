package pvorobey.lab5;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int[] mas=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i=9; i>=0; i--) {
            mas[i]=scanner.nextInt();
        }
        for (int element:mas){
            System.out.println(element);
        }
    }
}
