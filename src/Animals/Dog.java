package Animals;

public class Dog extends Pet {

    public Dog(String name) {
        this(name,0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Pour dog food");
        System.out.println("Give command eat");
        System.out.println("I eat dog food and drink water");
    }
}
