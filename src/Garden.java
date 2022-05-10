public class Garden implements Waterable
{
    private String name;

    public Garden(String name)
    {
        this.name = name;
    }

    public void giveWater()
    {
        System.out.println("The flowers are happy you watered them!");
    }

    public void sound()
    {
        System.out.println("Chirp chirp! Hear those birds?");
    }
}
