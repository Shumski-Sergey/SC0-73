public class Main {

    public static void main(String[] args) {
        int a = 5, b = 5;
        int c = 4, g = 4;

        int result = sumToObjects(a, b);
        int result2 = sumToObjects(c, g);
        double result3 = sumToObjects(10, 26.1214d);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static int sumToObjects(int first, int second) {
        return first + second;
    }

    private static double sumToObjects(int first, double second) {
        return first + second;
    }
}
