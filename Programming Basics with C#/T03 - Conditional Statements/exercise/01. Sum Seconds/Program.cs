﻿using System;

internal class Program
{
    static void Main()
    {
        int first = int.Parse(Console.ReadLine());
        int second = int.Parse(Console.ReadLine());
        int third = int.Parse(Console.ReadLine());

        int sum = first + second + third;
        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10)
        {
            Console.WriteLine($"{minutes}:0{seconds}");
        }

        else
        {
            Console.WriteLine($"{minutes}:{seconds}");
        }
    }
}