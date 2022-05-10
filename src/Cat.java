public class Cat implements Waterable
{
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public void giveWater()
    {
        System.out.println("Don't splash the cat! They hate water!");
    }

    public void sound()
    {
        System.out.println("Meow meow!");
    }
}
