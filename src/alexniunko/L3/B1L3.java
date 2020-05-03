package alexniunko.L3;

import java.util.Scanner;

public class B1L3 {
    public static int dis(int a,int b,int c){
        int dis=b*b-4*a*c;
        return dis;
    }
    double dis;
    public static void main(String args[]){
        System.out.println("Введите три числа");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int discr=dis(a,b,c);
        if (discr > 0) {
            double x1 = (- b + Math.sqrt(discr)) / (2 * a);
            double x2 = (- b - Math.sqrt(discr)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        else if (discr == 0) {
            double x1 = - b / (2 * a);
            System.out.println(x1);
        }
        else if (discr < 0) {
            System.out.println("Отрицательный дискриминант");
        }
    }
}
