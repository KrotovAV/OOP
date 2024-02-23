using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Man : Person
    {
        public bool HasBeard { get; private set; } = true;
        protected override string HelloPhrase { get; set; } = "Привет, привет!";

        public Man(string name) : base(name)
        {
        }

        public Man(string name, DateTime birthday) : base(name, birthday)
        {
        }

        public override void SayHello()
        {
            Console.WriteLine($"{Name}: Привет, я мужчина!");
        }

        public void SayHelloLikeAParent()
        {
            base.SayHello();
        }

        public void Shave()
        {
            Console.WriteLine($"{Name}: Бреется");
            this.HasBeard = false;
        }
        protected override void TakeCareImlementation()
        {
                Console.WriteLine($"{Name} проверяет уроки и потом идет с детьми на прогулку.");
        }
        new public void Print()
        {
            Console.WriteLine($"Имя = {Name}, день рождения = {Birthday.ToString("dd.MM.yyyy")}(Метод класса Man)");
        }
    }
}
