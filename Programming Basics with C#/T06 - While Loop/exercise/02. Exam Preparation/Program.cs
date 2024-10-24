﻿using System;

internal class Program
{
    static void Main()
    {
        int maxMistakes = int.Parse(Console.ReadLine());
        int mistakesCounter = 0;
        int counter = 0;
        string currentProblem = "";
        string lastProblem = "";
        bool isFailed = true;
        double gradeTotal = 0;

        while (mistakesCounter < maxMistakes)
        {
            currentProblem = Console.ReadLine();
            if (currentProblem == "Enough") { isFailed = false; break; }
            counter++;
            int currentGrade = int.Parse(Console.ReadLine());
            gradeTotal += currentGrade;
            if (currentGrade <= 4) mistakesCounter++;
            lastProblem = currentProblem;
        }

        if (isFailed) Console.WriteLine($"You need a break, {maxMistakes} poor grades.");
        else
        {
            Console.WriteLine($"Average score: {(gradeTotal / counter * 1.0):F2}");
            Console.WriteLine($"Number of problems: {counter}");
            Console.WriteLine($"Last problem: {lastProblem}");
        }
    }
}