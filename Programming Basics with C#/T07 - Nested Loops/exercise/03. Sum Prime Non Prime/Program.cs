using System;

internal class Program
{
    static void Main()
    {
        int prime = 0;
        int nonprime = 0;

        string input = Console.ReadLine();

        while (input != "stop")
        {
            bool isItPrime = true;
            int num = int.Parse(input);

            if (num < 0) Console.WriteLine("Number is negative.");
            else
            {
                for (int i = 2; i <= num / 2; i++)
                {
                    if (num % i == 0) isItPrime = false;
                }
                if (isItPrime) prime += num;
                else nonprime += num;
            }
            input = Console.ReadLine();
        }
        Console.WriteLine($"Sum of all prime numbers is: {prime}");
        Console.WriteLine($"Sum of all non prime numbers is: {nonprime}");
    }
}