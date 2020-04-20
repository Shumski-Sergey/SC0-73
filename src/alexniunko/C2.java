package alexniunko;
import java.util.Scanner;
public class C2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a,b,Sum;
        System.out.println("Введите число 1:");
        a = num.nextInt();
        System.out.println("Введите число 2:");
        b = num.nextInt();
        Sum=a+b;
        System.out.println("DEC: "+a+"+"+b+"="+Sum);
        System.out.println("BIN: "+Integer.toBinaryString(a)+"+"+Integer.toBinaryString(b)+"="+Integer.toBinaryString(Sum));
        System.out.println("HEX: "+Integer.toHexString(a)+"+"+Integer.toHexString(b)+"="+Integer.toHexString(Sum));
        System.out.println("OCTAL: "+Integer.toOctalString(a)+"+"+Integer.toOctalString(b)+"="+Integer.toOctalString(Sum));
    }
}