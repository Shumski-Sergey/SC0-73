package vm;

import java.util.Scanner;

public class Lab8 {
    static void main(String[] args) {
        int[] mac = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 9; i >= 0; i--) {
            mac[i] = scanner.nextInt();
        }

            for (int element: mac) {
                System.out.println(element);
                
            }
            
        }

    }

