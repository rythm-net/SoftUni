using System;

internal class Program
{
    static void Main()
    {
        int student = 0;
        int standard = 0;
        int kid = 0;
        int totalTickets = 0;

        string input = Console.ReadLine();

        while (input != "Finish")
        {
            int maxSeatsThisMovie = int.Parse(Console.ReadLine());
            int seats = 0;
            string type = Console.ReadLine();

            while (type != "End")
            {
                if (type == "student") student++;
                if (type == "standard") standard++;
                if (type == "kid") kid++;

                seats++;
                totalTickets++;

                if (seats == maxSeatsThisMovie) break;
                type = Console.ReadLine();
            }
            Console.WriteLine($"{input} - {(seats * 100.0 / maxSeatsThisMovie):f2}% full.");
            input = Console.ReadLine();
        }
        Console.WriteLine($"Total tickets: {totalTickets}");
        Console.WriteLine($"{(student * 100.0 / totalTickets):f2}% student tickets.");
        Console.WriteLine($"{(standard * 100.0 / totalTickets):f2}% standard tickets.");
        Console.WriteLine($"{(kid * 100.0 / totalTickets):f2}% kids tickets.");
    }
}