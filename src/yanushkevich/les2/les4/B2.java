package yanushkevich.les2.les4;


import java.util.Scanner;

public class B2 {
        public static void main(String[] args){
            Scanner k = new Scanner(System.in);
            int a = k.nextInt();
            int y=0;
            for(int i = 1; y <= a; i++ ){
                y=y+ i;
                System.out.print(y+",");
            }
        }

}

