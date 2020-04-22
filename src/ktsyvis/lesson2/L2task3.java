package ktsyvis.lesson2;
/*
Измените переменные и строку вывода в программе так, чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

public class L2task3 {
// вариант 2 без функций
public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int k=i*i+j*j;
        System.out.println(i+"*"+i+"+"+ j+"*"+j+"="+k);
    }
}

/*
public static void main(String[] args) {
        int i = 3;
        int j = 4;
        double k = Math.pow(i,2)+Math.pow(j,2);
        System.out.println(i+"*"+i+"+"+ j+"*"+j+"="+ Math.round(k));
    }
}


 */


// сделать расчет через цикл -для себя

    /*
        static int power(int i, int j){
            int result = 1;
            for (int a=1; a<=j; a++){
                result = result*i;
            }
            return result;
        }

        public static void main(String[] args){
            System.out.println(power(3,2) + power(4,2));
        }
    }
    */