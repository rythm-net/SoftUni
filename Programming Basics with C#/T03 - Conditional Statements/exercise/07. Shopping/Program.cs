﻿using System;

public class Program
{
    static void Main()
    {
        double bugetPetar = double.Parse(Console.ReadLine());

        int videoCards = int.Parse(Console.ReadLine());
        int proccesors = int.Parse(Console.ReadLine());
        int ram = int.Parse(Console.ReadLine());

        double praiceVideoCards = videoCards * 250;
        double praiceProccesors = (praiceVideoCards * 0.35) * proccesors;
        double praiceRam = (praiceVideoCards * 0.1) * ram;
        double totalSum = praiceVideoCards + praiceProccesors + praiceRam;

        if (videoCards > proccesors)
            totalSum -= totalSum * 0.15;
        if (totalSum <= bugetPetar)
            Console.WriteLine($"You have {bugetPetar - totalSum:f2} leva left!");
        else if (totalSum > bugetPetar)
            Console.WriteLine($"Not enough money! You need {totalSum - bugetPetar:f2} leva more!");
    }
}