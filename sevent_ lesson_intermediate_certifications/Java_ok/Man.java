import java.time.LocalDate;

public class Man extends Person {
    public boolean hasBeard = true;
    public boolean isHasBeard() {
        return hasBeard;
    }

    public void setHasBeard(boolean hasBeard) {
        this.hasBeard = hasBeard;
    }

    protected String helloPhrase = "Привет, привет!";
    
    public String getHelloPhrase() {
        return helloPhrase;
    }

    
    public void setHelloPhrase(String helloPhrase) {
        this.helloPhrase = helloPhrase;
    }

    public Man(String name) {
        super(name);
    }

    public Man(String name, LocalDate birthday) {
        super(name, birthday);
    }

    @Override
    public void SayHello() {
        System.out.printf("%s: Привет, я мужчина!\n", name);
    }

    public void SayHelloLikeAParent() {
        super.SayHello();
    }

    public void Shave() {
        System.out.printf("%s: Бреется\n", name);
        this.hasBeard = false;
    }

    @Override
    protected void TakeCareImlementation() {
        System.out.printf("%s проверяет уроки и потом идет с детьми на прогулку.\n", name);
    }

    @Override
    public void Print()
    {
        System.out.printf("Имя - %s, день рождения - %s\n", name, birthday);
    }
}
