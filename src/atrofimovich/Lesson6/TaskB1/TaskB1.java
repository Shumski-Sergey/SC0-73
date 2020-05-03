package atrofimovich.Lesson6.TaskB1;

public class TaskB1 {
    public static void main(String[] args) {
        int a = 5;
        Dog[] dogs = new Dog[a];
        dogs[0] = new Dog();
        dogs[0].setName("Sharky");
        dogs[0].setSize(1);
        dogs[1] = new Dog();
        dogs[1].setName("Buggy");
        dogs[1].setSize(2);
        dogs[2] = new Dog();
        dogs[2].setName("Bobby");
        dogs[2].setSize(3);
        dogs[3] = new Dog();
        dogs[3].setName("Bossy");
        dogs[3].setSize(4);
        dogs[4] = new Dog();
        dogs[4].setName("Canny");
        dogs[4].setSize(5);
        DogHelper.printAllNames(dogs);
        DogHelper.averageAge(dogs);
    }
}
