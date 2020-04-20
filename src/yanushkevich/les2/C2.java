package yanushkevich.les2;

import java.util.Scanner;

  public class C2 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int s = a + b;
        System.out.println(" DEC " + " : " + " 34 + 26 " + " = " + s );
        System.out.println(" BIN " + " : " + " 10 0010 + 1 1010 " + " = " + Integer.toBinaryString(s));
        System.out.println(" HEX " + " : " + " 22 + 1A " + " = " + Integer.toHexString(s));
        System.out.println(" OKT " + " : " + " 42 + 32 " + " = " + Integer.toOctalString(s));
    }
}
