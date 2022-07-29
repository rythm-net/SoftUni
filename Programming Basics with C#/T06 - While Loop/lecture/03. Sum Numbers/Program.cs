using System;

internal class Program
{
    static void Main()
    {
        int limit = int.Parse(Console.ReadLine());
        int sum = 0;

        while (sum < limit)
        {
            int newNum = int.Parse(Console.ReadLine());
            sum += newNum;
        }
        Console.WriteLine(sum);
    }
}