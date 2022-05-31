using System;
using System.Text.RegularExpressions;

namespace _01._Match_Full_Name
{
    class Program
    {
        static void Main(string[] args)
        {
            string namePattern = @"\b[A-Z][a-z]{1,} [A-Z][a-z]{1,}\b";
            string input = Console.ReadLine();

            MatchCollection matches = Regex.Matches(input, namePattern);

            foreach (Match name in matches)
            {
                Console.Write($"{name.Value} ");
            }
        }
    }
}