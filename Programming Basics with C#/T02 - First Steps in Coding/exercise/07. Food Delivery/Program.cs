using System;

namespace _07._Food_Delivery
{
    internal class Program
    {
        static void Main()
        {
            double chicken = double.Parse(Console.ReadLine()) * 10.35;
            double fish = double.Parse(Console.ReadLine()) * 12.40;
            double vegetarian = double.Parse(Console.ReadLine()) * 8.15;
            double dinner = chicken + fish + vegetarian;
            double desert = 0.2 * dinner;
            double total = dinner + desert + 2.50;

            Console.WriteLine(total);
        }
    }
}