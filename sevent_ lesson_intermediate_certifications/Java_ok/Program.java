import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var man = new Man("Алексей", LocalDate.parse("1990-01-01"));
        var woman = new Woman("Анна", LocalDate.parse("1998-01-01"));

        var anotherWoman = new Woman("Кира Петровна", LocalDate.parse("1970-01-01"));

        // man.Print();
        // woman.Print();

        // man.SayHello();
        // man.Shave();

        // woman.SayHello();
        // woman.PutMakeupOn();
        // woman.RemoveMakeup();

        System.out.println();

        Person[] persons = new Person[] { man, woman };

        for (Person person : persons) {
            person.Print();
            person.SayHello();

            if (person instanceof Woman) {
                Woman w = (Woman) person;
                w.PutMakeupOn();
            }
            if (person instanceof Man) {
                Man m = (Man) person;
                m.Shave();
                m.SayHelloLikeAParent();
            }
            person.TakeCare();

            System.out.println();
        }

        System.out.println();

    }
}