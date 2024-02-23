import java.time.LocalDate;

public abstract class Person
{
    public String name;
    public LocalDate birthday;
    protected String helloPhrase;
    
    public Person(String name)
    {
        this.name = name;
    }
    public Person(String name, LocalDate birthday)
    {
        this.birthday = birthday;
        this.name = name;
    }

    public void SayHello()
    {
        System.out.printf("%s: Привет, я человек!\n", name);
    }

    public void SayHelloPhrase()
    {
        System.out.printf("%s: %s \n", name, helloPhrase);
    }

    public void Print()
    {
        System.out.printf("Имя = %s, день рождения = %s\n", name, birthday);
    }

    protected abstract void TakeCareImlementation();

    public void TakeCare()
    {
        TakeCareImlementation();
    }
}
