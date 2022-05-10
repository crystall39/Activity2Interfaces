import java.util.ArrayList;
import java.util.Collections;

public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Waterable> objects = new ArrayList<>();

        Cat cat1 = new Cat("Midnight");
        Garden garden1 = new Garden("Mr. Miller's Garden");

        objects.add(cat1);
        objects.add(garden1);

        for (Waterable object : objects)
        {
            object.giveWater();
            object.sound();
        }

        Dog dog1 = new Dog("Buddy", 3, 5);
        Dog dog2 = new Dog("Luna", 5, 6);
        Dog dog3 = new Dog("Bailey", 8, 7);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        Collections.sort(dogs);
        for (Dog dog : dogs)
        {
            System.out.println(dog);
        }
    }
}
