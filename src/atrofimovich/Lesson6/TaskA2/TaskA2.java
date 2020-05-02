package atrofimovich.Lesson6.TaskA2;

public class TaskA2 {
    public static void main(String[] args) {
        Dog sharky = new Dog();
        sharky.setSize(5);
        sharky.setName("Sharky");
        Dog wuffy = new Dog();
        wuffy.setSize(3);
        wuffy.setName("Wuffy");
        sharky.newToString();
        wuffy.newToString();
    }
}
