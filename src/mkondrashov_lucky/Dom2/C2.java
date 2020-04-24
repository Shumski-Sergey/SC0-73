package mkondrashov_lucky.Dom2;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args){
        System.out.println("Введите четырехзначное число: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int x1 = Integer.parseInt(x);
        if (x1>=1000 & x1<10000) {
            int u, i, o, p, itog;
            u = x.charAt(0);
            i = x.charAt(1);
            o = x.charAt(2);
            p = x.charAt(3);
            int u1 = Character.getNumericValue(u);
            int i1 = Character.getNumericValue(i);
            int o1 = Character.getNumericValue(o);
            int p1 = Character.getNumericValue(p);
            itog = u1 + i1 + o1 + p1;
            System.out.println("Сумма чисел, входящих в состав введенного: " + itog);
        }
        else System.out.println("Введено неверное число, попробуйте снова");
    }
}
