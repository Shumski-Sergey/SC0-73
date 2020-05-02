package atrofimovich.Lesson6.TaskA1;

public class TaskA1 {
    public static void main(String[] args) {
        Dog sharky = new Dog();
        sharky.setSize(5);
        sharky.setName("Sharky");
        Dog wuffy = new Dog();
        wuffy.setSize(3);
        wuffy.setName("wuffy");
        System.out.println("Первая собака:\n".concat(sharky.getName().concat(" " + sharky.getSize())));
        System.out.println("Вторая собака:\n".concat(wuffy.getName().concat(" " + wuffy.getSize())));
    }
}
