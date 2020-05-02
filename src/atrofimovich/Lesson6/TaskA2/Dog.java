package atrofimovich.Lesson6.TaskA2;

public class Dog {
    private int size;
    private String name;

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

    public void newToString() {
        System.out.printf("Кличка: %s. Возраст: %d\n", getName(), getSize());
    }
}

//метод toString() уже существует в стандартной библиотеке java, поэтому создал свой
