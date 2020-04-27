package yanushkevich.les2.les4;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        if ( a == b && b == c )
            System.out.println( a + " " + b + " "+ c );
        else if (a == b)
            System.out.println(a+" " + b);
        else if (b == c)
            System.out.println(b+" " + c);
        else if (a == c)
            System.out.print(a+" " + c);
    }
}
