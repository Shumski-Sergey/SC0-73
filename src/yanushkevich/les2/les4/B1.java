package yanushkevich.les2.les4;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int x1 = 366;
        int x2 = 365;
        if ( a % 4 !=0){
            System.out.println("Колличество дней в году : " + x2 );
        }
        else if (a % 400 == 0 && a % 100 == 0){
            System.out.println("Колличество дней в году : " + x1 );
        }
        else if (a % 400 != 0 && a % 100 == 0){
            System.out.println("Колличество дней в году : " + x2 );
        }
        else {
            System.out.println("Колличество дней в году : " + x1 );
        }

    }
}
