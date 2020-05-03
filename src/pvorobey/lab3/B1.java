package pvorobey.lab3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double dis, diss, x, x1, x2;
        dis=b*b-4*a*c;
        diss=Math.sqrt(dis);
        if (dis>0) { System.out.println("x1="+(-b+diss)/(2*a)+" "+"x2="+(-b-diss)/(2*a));}
        else if (dis==0) { System.out.println("x="+(-b/(2*a)));}
        else if (dis<0) { System.out.println("отрицательный дискриминант");}
    }
}
