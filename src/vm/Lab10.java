package vm;

import java.util.ArrayList;

public class Lab10 {
    public static void main (String[] args){
        int [] data = {1,2,3,4,5} ;
        ArrayList list = new ArrayList();
        for (int i = 0; i< data.length; i++) list.add(data[i]);
        System.out.println(list);

    }
}
