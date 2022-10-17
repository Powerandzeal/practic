package Animals;

import java.time.LocalDate;
import java.util.Arrays;

public final class Cat extends Pet {
    private static int count;

    public static int getCount() {
        return count;
    }

    public static class Breed {
        private String name;

        private String country;

        private String hairType;

        public Breed(String name, String country, String hairType) {
            this.name = name;
            this.country = country;
            this.hairType = hairType;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy {
        private String name;
        private String type;

        public FavToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getCatName() {
            return Cat.this.getName();
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }


    private Pet[] friends;
    private Breed breed;
    private FavToy toy;


    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, int age) {
        super(name, age);

        friends = new Cat[0];
        count++;
    }

    @Override
    public void eat() {
        System.out.println("Poor cat food in the bowl");
        System.out.println("Eat cat food");
        System.out.println("Drink water");
    }

    public void meow() {
        System.out.println("мяу");
        System.out.println("Меня зовут" + getName());
        System.out.println("Мне " + getAge() + "");

    }

    public Pet[] getFriends() {
        if (friends == null) {
            friends = new Pet[0];
        }
        return friends;
    }

    public void addFriend(Pet friend) {
        this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;

    }


    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }


}
