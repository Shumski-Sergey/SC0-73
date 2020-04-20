package alexniunko;
import java.util.Scanner;
public class C1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a,b,Sum;
        System.out.println("Введите число 1:");
        a = num.nextInt();
        System.out.println("Введите число 2:");
        b = num.nextInt();
        Sum=a+b;
        System.out.println("Cумма" + "=" + Sum);
            }
}