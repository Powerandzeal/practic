import Animals.Cat;
import Animals.Cat.FavToy;
import Animals.Dog;
import Animals.Parrot;
import Animals.Pet;


public class Main {
    public static void main(String[] args) {
        Cat.Breed brshBreed = new Cat.Breed("British ShortHair","GB","short");

        Cat murzik = new Cat("Murzik");
        murzik.setBreed(brshBreed);

        FavToy murzikFavToy = murzik.new FavToy ("Fish","Zavodnaya");
        murzik.setToy(murzikFavToy);
        //System.out.println(murzikFavToy.getCatName());
//        murzik.talk();
//        murzik.eat();
        Dog sharik = new Dog("Sharik");
//        sharik.talk();
//        sharik.eat();
        Parrot kesha = new Parrot("Kesha");
//        kesha.talk();
//        kesha.eat();

        Cat begemot = new Cat("begemot", -5);
        begemot.setName(null);
//        begemot.meow();

        murzik.addFriend(begemot);
        murzik.addFriend(sharik);
        murzik.addFriend(kesha);
//        System.out.println();

//        for (Pet friend : murzik.getFriends()) {
//            System.out.println(friend.getName());
//        }





        //murzik.meow();

       /*

        //murzik.friends = null;

        //System.out.println("Animals.Cat " + murzik.getName() + "have " + murzik.getFriends().length + " friends");

        System.out.println("Animals.Cat " + murzik.getName() + "have " + murzik.getFriends().length + " friends");

        System.out.println(Cat.getCount());
       // murzik.friends[0].meow();*/


    }
}