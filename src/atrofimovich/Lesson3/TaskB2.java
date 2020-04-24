package atrofimovich.Lesson3;

public class TaskB2 {
    public static void main(String[] args){
        double d = 111.111;
        byte b = 0b111;
        long o = 73;   //java просит преобразовать запись 0111 в 73
        int h = 0x111;
        float f = 111.111f;
        double a = getSum(d, b, o, h, f);
        System.out.println("Число в десятичном формате: " + d + "\n" + "Число в двоичном формате: " + b + "\n" + "Число в восьмеричном формате: " + o + "\n" + "Число в шеснадцатеричном формате: " + h + "\n" + "Число в десятичном формате: " + f);
        System.out.println("Сумма всех чисел равна: " + a);
    }

    private static double getSum(double d, byte b, long o, int h, float f){
        return d + b + o + h + f;
    }
}
