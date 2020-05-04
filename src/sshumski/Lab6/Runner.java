package sshumski.Lab6;

public class Runner {
    public static void main(String[] args) {
        Dog firstDog = new Dog(8.6, 60, "Boyka", 7);
        Dog secondDog = new Dog(15, 57, "Champ", 7);
        System.out.println(firstDog.win(secondDog) ? firstDog.getName() : secondDog.getName());
    }
}
