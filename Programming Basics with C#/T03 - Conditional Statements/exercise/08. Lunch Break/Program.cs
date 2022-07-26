using System;

internal class Program
{
    static void Main()
    {
        string showName = Console.ReadLine();

        int epidoseLength = int.Parse(Console.ReadLine());
        int breakLength = int.Parse(Console.ReadLine());

        double lunch = breakLength / 8.0;
        double rest = breakLength / 4.0;
        double freeTime = breakLength - lunch - rest;

        if (freeTime >= epidoseLength)
        {
            Console.WriteLine($"You have enough time to watch {showName} and left with {Math.Ceiling(freeTime - epidoseLength)} minutes free time.");
        }

        else
        {
            Console.WriteLine($"You don't have enough time to watch {showName}, you need {Math.Ceiling(epidoseLength - freeTime)} more minutes.");
        }
    }
}