package abaranov.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskA2 {
     public static void main (String[] args ) throws IOException {
         ArrayList<String> list = new ArrayList<String>();
         System.out.println("Введите строки: ");
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         while (true) {
             String s = reader.readLine();
             if (s.equalsIgnoreCase("End"))
                 break;
             list.add(s);
         }
         System.out.println("Строки, которые были введены:".concat(String.valueOf(list)));


        }
}
