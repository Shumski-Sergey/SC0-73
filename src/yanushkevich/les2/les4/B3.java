package yanushkevich.les2.les4;


public class B3 {
    public static void main(String[] args) {
            int a=1,b=1;
            while(a<=10)
            {
                System.out.print(a+" ");
                while(b<=9)
                {
                    b++;
                    System.out.print(a * b +" ");
                }
                a++;
                b=1;
                System.out.println(" ");
            }
        }
}
