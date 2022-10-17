package Animals;

public class Humster extends Pet {

    public Humster(String name) {
        this(name,0);
    }

    public Humster(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat humster food");
    }
}
