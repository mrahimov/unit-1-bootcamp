/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {

        Cat garfield = new Cat();
        Cat catwoman = new Cat();
        Cat pinkPanther = new Cat();

        garfield.setName("Garfield");
        garfield.setFavoriteFood("Lasagna");
        garfield.setAge(10);

        pinkPanther.setName("Pink Panther");
        pinkPanther.setFavoriteFood("plov");
        pinkPanther.setAge(2);

        catwoman.setName("Catwoman");
        catwoman.setFavoriteFood("hotdog");
        catwoman.setAge(3);

        System.out.println(isOlder(garfield, pinkPanther)); //returns true
        String kittenName = makeKitten(garfield, catwoman).getName();
        int kittenAge = makeKitten(garfield, catwoman).getAge();
        System.out.println("new kitten name is " + kittenName + " age " + kittenAge);

        Person jon = new Person();
        jon.setName("Jon");

        adoption(garfield, jon); // Jon is now Garfield's owner!



    }



    private static boolean isOlder(Cat garfield, Cat pinkPanther) {
        if (garfield.getAge() > pinkPanther.getAge()) {
            return true;
        }
        return false;

    }

    public static void makeBestFriends(Cat garfield, Cat pinkPanther) {
        if (garfield.getFavoriteFood() != null) {
            String bestFood = garfield.getFavoriteFood();
            pinkPanther.setFavoriteFood(bestFood);
        } else if (pinkPanther.getFavoriteFood() != null)
        {
            String bestFood = pinkPanther.getFavoriteFood();
            garfield.setFavoriteFood(bestFood);
        }
        garfield.setFavoriteFood("pizza");
        pinkPanther.setFavoriteFood("pizza");
    }

    public static Cat makeKitten(Cat g, Cat c) {
        String gName = g.getName();
        String cName = c.getName();

        Cat kitten = new Cat();
        kitten.setName(gName + cName);
        kitten.setAge(0);

        return kitten;
    }

    private static void adoption(Cat cat, Person person) {

        cat.setOwner(person);
        System.out.println(cat.getOwner().toString());

    }

}







