using System;

internal class Program
{
    static void Main()
    {
        string name = Console.ReadLine();
        string pass = Console.ReadLine();
        string attempt = string.Empty;

        while (attempt != pass)
        {
            attempt = Console.ReadLine();
        }
        Console.WriteLine($"Welcome {name}!");
    }
}