namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");


            var man = new Man("Алексей", DateTime.Parse("01.01.1990"));
            var woman = new Woman("Анна", DateTime.Parse("01.01.1998"));
            
            var anotherWoman = new Woman("Кира Петровна", DateTime.Parse("01.01.1970"));

            //man.Print();
            //woman.Print();

            //man.SayHello();
            //man.Shave();

            //woman.SayHello();
            //woman.PutMakeupOn();
            //woman.RemoveMakeup();

            //man.SayHelloPhrase();
            //woman.SayHelloPhrase();

            Person[] persons = new Person[] { man, woman };
            foreach (Person person in persons)
            {
                person.Print();
                person.SayHello();

                Woman w = person as Woman;
                w?.PutMakeupOn();

                Man m = person as Man;
                m?.Shave();
                m?.SayHelloLikeAParent();
                person.SayHelloPhrase();
                person.TakeCare();

                Console.WriteLine();
            }

            IParent daddy = man;
            IParent mammy = woman;
            IBabySitter nanny = anotherWoman;

            daddy.TakeCare();
            mammy.TakeCare();
            nanny.TakeCare();

        }
            
    }
}