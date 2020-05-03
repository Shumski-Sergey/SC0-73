package atrofimovich.Lesson6.TaskB1;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        int x = 5;
        for(int i = 0; i < x; i++){
            System.out.print(dogs[i].getName() + ("; "));
        }
        System.out.println();
    }

    static void averageAge(Dog[] dogs){
        int x = 5;
        double sum = 0;
        for (int i = 0; i < x; i++) {
            sum += dogs[i].getSize();
            }
        System.out.println(sum / x + "!");
    }
}
