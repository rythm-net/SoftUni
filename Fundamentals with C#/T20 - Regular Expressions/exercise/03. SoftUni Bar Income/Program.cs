using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace _03._SoftUni_Bar_Income
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string pattern = @"%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\w]+)>[^|$%.]*\|(?<count>[\d]+)\|[^|$%.]*?(?<price>[\d]+[.]?[\d]+)?\$";
            decimal totalIncome = 0;
            string command = Console.ReadLine();

            while (command != "end of shift")
            {
                Regex regex = new Regex(pattern);

                bool isValid = regex.IsMatch(command);

                if (isValid)
                {
                    string name = regex.Match(command).Groups["name"].Value;
                    string product = regex.Match(command).Groups["product"].Value;

                    int quantity = int.Parse(regex.Match(command).Groups["count"].Value);

                    decimal price = decimal.Parse(regex.Match(command).Groups["price"].Value);
                    decimal totalPrice = price * quantity;

                    totalIncome += totalPrice;

                    Console.WriteLine($"{name}: {product} - {totalPrice:f2}");
                }
                command = Console.ReadLine();
            }
            Console.WriteLine($"Total income: {totalIncome:F2}");
        }
    }
}