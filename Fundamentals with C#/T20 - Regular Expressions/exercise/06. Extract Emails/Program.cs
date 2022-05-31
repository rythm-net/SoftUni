using System;
using System.Text.RegularExpressions;

namespace _06._Extract_Emails
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string pattern = @"(^|(?<=\s))[A-Za-z]+([\.,-_]*?)[A-Za-z0-9]*?@[a-z]+([\.,-_]*?)[A-Za-z0-9]*?\.[a-z]+([\.,-_]*?)[A-Za-z0-9]*[a-z]+([\.,-_]*?)[A-Za-z0-9]*?\b";
            string input = Console.ReadLine();

            MatchCollection matches = Regex.Matches(input, pattern);

            foreach (Match match in matches)
            {
                Console.WriteLine(match);
            }
        }
    }
}