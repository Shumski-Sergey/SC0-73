package vm;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> array = new ArrayList<>();
        for (;;){
            String value = scanner.next();
            if (value.equals("END"))
                break;
            array.add(value);
            {
                System.out.println(array);
            }
            
        }
    }
        

}
