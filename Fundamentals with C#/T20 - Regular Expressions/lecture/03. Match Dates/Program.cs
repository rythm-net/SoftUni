using System;
using System.Text.RegularExpressions;

namespace _03._Match_Dates
{
    class Program
    {
        static void Main(string[] args)
        {
            string yearPtn = @"\b(?<day>\d{2})([/\.-])(?<month>[A-Z][a-z]{2})(\1)(?<year>\d{4})\b";
            string input = Console.ReadLine();

            MatchCollection validDates = Regex.Matches(input, yearPtn);

            foreach (Match date in validDates)
            {
                string day = date.Groups["day"].Value;
                string month = date.Groups["month"].Value;
                string year = date.Groups["year"].Value;

                Console.WriteLine($"Day: {day}, Month: {month}, Year: {year}");
            }
        }
    }
}