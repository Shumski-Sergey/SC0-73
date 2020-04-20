package alexniunko;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
public class С3<WeightMars> {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a;
        System.out.println("Введите массу человека на Земле:");
        a = num.nextInt();
        System.out.println(getWeight(a));
    }
    public static double getWeight(double weightEarth) {
        double a = weightEarth;
        double b = (3.86 / 9.81) * a;
        double weightMars = new BigDecimal(b).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("Вес человека на Марсе в кг ");
        return weightMars;
    }
}

