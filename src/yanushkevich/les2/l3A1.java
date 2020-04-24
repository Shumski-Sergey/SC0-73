package yanushkevich.les2;

import java.util.Scanner;
   public class l3A1 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int sm = a + b;
        int raz = a - b;
        int mn = a * b;
        int dl = a / b;
        int md = a % b;
        System.out.println(sm+ " " + raz + " " + mn + " " + dl + " " + md);
        double ssm = a + b;
        double rraz = a - b;
        double mmn = a * b;
        double ddl = (double) a / b;
        double mmd = a % b;
        System.out.println(ssm + " " + rraz + " " + mmn + " " + ddl + " " +mmd);
    }
}
