package yponomareva.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String word = reader.readLine();
            if (word.equalsIgnoreCase("end"))
                break;
            words.add(word);
        }
        System.out.print(words);
    }
}
