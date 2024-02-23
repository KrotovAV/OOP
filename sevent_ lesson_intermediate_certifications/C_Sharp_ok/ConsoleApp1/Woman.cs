using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Woman : Person, IBabySitter
    {
        public bool HasMakeup { get; private set; } = false;
        protected override string HelloPhrase { get; set; } = "Здравствуйте, мальчики, я женщина!";

        public Woman(string name) : base(name)
        {
        }

        public Woman(string name, DateTime birthday) : base(name, birthday)
        {
        }

        public sealed override void SayHello()
        {
            Console.WriteLine($"{Name}: Прииивет!, я женщина!");
        }

        public void PutMakeupOn()
        {
            Console.WriteLine($"{Name} наносит макияж");
            this.HasMakeup = true;
        }

        public void RemoveMakeup()
        {
            Console.WriteLine($"{Name} удаляет макияж");
            this.HasMakeup = false;
        }

        protected override void TakeCareImlementation()
        {
  
                Console.WriteLine($"{Name} кормит ужином и укладывает спать.");
        }

        void IBabySitter.TakeCare()
        {
            Console.WriteLine($"{Name} сидит с детьми пока родители на работе.");
        }

    }
}
