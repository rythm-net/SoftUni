using System;

namespace _02._Oldest_Family_Member
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            Family myFamily = new Family();

            for (int i = 0; i < n; i++)
            {
                string[] commandArgs = Console.ReadLine()
                    .Split(' ', StringSplitOptions.RemoveEmptyEntries);

                string name = commandArgs[0];
                int age = int.Parse(commandArgs[1]);

                Person newPerson = new Person(name, age);
                myFamily.AddPerson(newPerson);
            }
            Person oldestMember = myFamily.GetOldestMember();

            Console.WriteLine($"{oldestMember.Name} {oldestMember.Age}");
        }
    }
}