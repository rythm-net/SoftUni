using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace _05._Nether_Realms
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string healthPattern = @"[^\+\-\*\/\.\,0-9 ]";
            string damagePattern = @"-?\d+\.?\d*";
            string multiplicationPattern = @"[\*\/]";
            string splitPattern = @"[,\s]+";
            string input = Console.ReadLine();

            string[] demons = Regex.Split(input, splitPattern).OrderBy(x => x).ToArray();

            for (int i = 0; i < demons.Length; i++)
            {
                string currDemon = demons[i];

                MatchCollection healthMatched = Regex.Matches(currDemon, healthPattern);
                long health = 0;

                foreach (Match match in healthMatched)
                {
                    char currCh = char.Parse(match.ToString());
                    health += currCh;
                }

                double damage = 0;
                MatchCollection damageMatched = Regex.Matches(currDemon, damagePattern);

                foreach (Match match in damageMatched)
                {
                    double currDamage = double.Parse(match.ToString());
                    damage += currDamage;
                }

                MatchCollection multiplicationMatches = Regex.Matches(currDemon, multiplicationPattern);

                foreach (Match match in multiplicationMatches)
                {
                    char currOperator = char.Parse(match.ToString());

                    if (currOperator == '*')
                    {
                        damage *= 2;
                    }
                    else
                    {
                        damage /= 2;
                    }
                }
                Console.WriteLine($"{currDemon} - {health} health, {damage:F2} damage");
            }
        }
    }
}