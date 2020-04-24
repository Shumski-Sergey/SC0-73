package mkondrashov_lucky.Dom2;

public class B1 {
    public static void main(String[] args){
        byte b = 0b01101111;
        int d = 111;
        long o = 0157;
        //так как по заданию сказано взять 2 числа с точкой, а в самом задании его не было, я заменил
        //int h на double h и оставил просто double e
        double h = 0x6F;
        float f = (float) 111.111;
        double e = 111.111;
        System.out.println(b+" "+d+" "+o+" "+h+" "+f+" "+e);
    }
}
