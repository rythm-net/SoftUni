using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace _02._Match_Phone_Number
{
    class Program
    {
        static void Main(string[] args)
        {
            string validPhoneNum = @"\s?\+359( |-)2(\1)(\d{3})(\1)(\d{4})\b";
            string phoneNumbers = Console.ReadLine();

            MatchCollection validNumbers = Regex.Matches(phoneNumbers, validPhoneNum);

            string[] numbersArr = validNumbers.Cast<Match>().Select(n => n.Value.Trim()).ToArray();

            Console.WriteLine(string.Join(", ", numbersArr));
        }
    }
}