﻿using System;

internal class Program
{
    static void Main()
    {
        int max = int.MinValue;
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
                max = Math.Max(max, num);
            }
        }
        Console.WriteLine(max);
    }
}