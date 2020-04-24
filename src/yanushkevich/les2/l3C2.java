package yanushkevich.les2;

public class l3C2 {
    public static void main(String[] args){
        System.out.println(sumDigitsInNumber(5467));
    }
    public static int sumDigitsInNumber(int s){
        int a = s / 1000;
        int b = (s-a * 1000) / 100;
        int c = (s-a * 1000 - b * 100) / 10;
        int d = s - a * 1000 - b * 100 - c * 10;
        int sum = a + b + c + d ;
        System.out.println(sum);
        return s;
    }
}
