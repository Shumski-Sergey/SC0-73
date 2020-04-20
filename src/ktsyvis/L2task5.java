package ktsyvis;
/*
1.Значения переменных а,b,c,d не изменять.
2. Перед каждой из переменных а,b,c, d
в строке с объявлением переменной result должен стоять один знак плюс либо минус.
3. В результате работы программы на экран нужно вывести число 20.
4. Знаки препинания плдюс и минус должны быть расставлены правильно.
 */
public class L2task5 {
    private static int a=1;
    private static int b=3;
    private static int c=9;
    private static int d=27;

    public static void main(String[] args) {
        int result = - a + b - c + d;
        System.out.println(result);
    }
}
