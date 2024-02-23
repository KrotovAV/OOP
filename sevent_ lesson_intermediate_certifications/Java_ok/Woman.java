import java.time.LocalDate;

public class Woman extends Person
{
    public boolean HasMakeup  = false;
    protected String HelloPhrase = "Здравствуйте, мальчики, я женщина!";

    public Woman(String name)
    {
        super(name);
    }

    public Woman(String name, LocalDate birthday)
    {
        super(name, birthday);
    }
    @Override
    public void SayHello()
    {
        System.out.printf("%s: Прииивет!, я женщина!\n", name);
    }

    public void PutMakeupOn()
    {
        System.out.printf("%s наносит макияж\n", name);
        this.HasMakeup = true;
    }

    public void RemoveMakeup()
    {
        System.out.printf("%s удаляет макияж\n", name);
        this.HasMakeup = false;
    }

    @Override
    protected void TakeCareImlementation()
    {
        System.out.printf("%s кормит ужином и укладывает спать.\n", name);
    }

    public boolean isHasMakeup() {
        return HasMakeup;
    }

    public void setHasMakeup(boolean hasMakeup) {
        HasMakeup = hasMakeup;
    }

    public String getHelloPhrase() {
        return HelloPhrase;
    }

    public void setHelloPhrase(String helloPhrase) {
        HelloPhrase = helloPhrase;
    }

}
