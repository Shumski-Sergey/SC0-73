package sshumski.Lab6;

public class Dog {
    private double power;
    private int weight;
    private String name;
    private int age;

    public Dog(double power, int weight, String name, int age) {
        this.power = power;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public double getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    boolean win(Dog dog) {
        return getDogChance() > dog.getDogChance();
    }

    private double getDogChance() {
        return this.getAge() * 0.2 + 0.3 * this.getWeight() + 0.5 * this.getPower();
    }
}
