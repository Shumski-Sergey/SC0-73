package atrofimovich.Lesson6.TaskC1;

public class Dog {
    private int size;
    private String name;
    private int weight;
    private double power;

    public int getSize() {
        return size;
    }

    public void setSize(int sizeSetter) {
        size = sizeSetter;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameSetter) {
        name = nameSetter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weightSetter) {
        weight = weightSetter;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double powerSetter) {
        power = powerSetter;
    }

    boolean win(Dog otherDog) {
        double winChance = 0.2 * getSize() + 0.3 * weight + 0.5 * power;
        return true;
    }
}
