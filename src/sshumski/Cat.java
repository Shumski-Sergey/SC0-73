package sshumski;

public class Cat extends Pet {
    public String name;

    //Constructor
    public Cat(String name) {
        this.name = name;
    }

    //Get
    protected String getName() {
        return name;
    }

    //Set
    //Not needed!
    protected void setName(String name) {
        this.name = name;
    }

    //Method
    void addExtendName() {
        System.out.println(name.concat(" addExtendName method"));
    }
}
