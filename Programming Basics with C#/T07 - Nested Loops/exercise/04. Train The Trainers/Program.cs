using System;

internal class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        string input = Console.ReadLine();
        string theme = string.Empty;

        double grade = 0;
        double totalGrade = 0;

        int numberThemes = 0;

        while (input != "Finish")
        {
            theme = input;
            for (int i = 1; i <= n; i++)
            {
                grade += double.Parse(Console.ReadLine());
            }

            grade = grade / n;
            Console.WriteLine($"{theme} - {grade:f2}.");
            totalGrade += grade;
            numberThemes++;
            grade = 0;
            input = Console.ReadLine();
        }
        Console.WriteLine($"Student's final assessment is {(totalGrade / numberThemes):f2}.");
    }
}