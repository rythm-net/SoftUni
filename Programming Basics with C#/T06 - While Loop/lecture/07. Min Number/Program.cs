using System;

internal class Program
{
    static void Main()
    {
        int min = int.MaxValue;
        string input;

        while (true)
        {
            int num;
            input = Console.ReadLine();

            if (input == "Stop") 
                break;
            else
            {
                num = int.Parse(input);
                min = Math.Min(min, num);
            }
        }
        Console.WriteLine(min);
    }
}