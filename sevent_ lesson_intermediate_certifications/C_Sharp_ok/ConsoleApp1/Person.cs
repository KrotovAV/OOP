using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public abstract class Person : IParent, IBabySitter
    {
        public readonly string Name;
        public readonly DateTime Birthday;
        protected abstract string HelloPhrase { get; set; }

        public Person(string name, DateTime birthday)
        {
            Birthday = birthday;
            Name = name;
        }

        public Person(string name)
        {
            Name = name;
            Birthday = DateTime.Now;
        }

        public virtual void SayHello()
        {
            Console.WriteLine($"{Name}: Привет, я человек!");
        }

        public virtual void SayHelloPhrase()
        {
            Console.WriteLine($"{Name}: {HelloPhrase}");
        }

        public void Print()
        {
            Console.WriteLine($"Имя - {Name}; День рождения - {Birthday.ToString("dd.MM.yyyy")}");
        }

        protected abstract void TakeCareImlementation();

        public void TakeCare()
        {
            TakeCareImlementation();
        }
    }
}
