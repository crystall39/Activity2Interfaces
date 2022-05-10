public class Dog implements Comparable
{
    private String name;
    private int age;
    private int hoursSlept;

    public Dog(String name, int age, int hoursSlept)
    {
        this.name = name;
        this.age = age;
        this.hoursSlept = hoursSlept;
    }

    public String toString()
    {
        return name + " is " + age + " years old and has slept " + hoursSlept + " hours today";
    }

    public int compareTo(Object other)
    {
        Dog safe = (Dog) other;
        if (this.age < safe.age)
        {
            return -1;
        }
        else if (this.age > safe.age)
        {
            return 1;
        }
        return 0;
    }
}
