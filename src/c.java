import java.util.Scanner;

public class c {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("a:");
    int a = sc.nextInt();
    System.out.println("b:");
        int b = sc.nextInt();
        int d=a+b;
    System.out.println(d);
    System.out.println(Integer.toBinaryString(a)+Integer.toBinaryString(b));
    System.out.println(Integer.toHexString(a)+Integer.toHexString(b));
    System.out.println(Integer.toOctalString(a)+Integer.toOctalString(b));
}
}