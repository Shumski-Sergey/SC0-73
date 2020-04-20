package alexniunko;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;
public class С3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int WeightHuman;
        double WeightMars;
        System.out.println("Введите массу человека на Земле:");
        WeightHuman = num.nextInt();
        WeightMars=(3.86/9.81)*WeightHuman;
        BigDecimal a=new BigDecimal(WeightMars);
        MathContext m = new MathContext(4);
        BigDecimal a2=a.round(m);
        System.out.println("Масса человека на Марсе : " + a2);
    }
}
