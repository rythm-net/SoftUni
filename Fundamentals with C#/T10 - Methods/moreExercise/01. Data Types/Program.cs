using System;

namespace _01._Data_Types
{
    class Program
    {
        static void Main(string[] args)
        {
            string dataType = Console.ReadLine();
            string value    = Console.ReadLine();

            if (dataType == "int")
            {
                int number = int.Parse(value);
                Console.WriteLine(ProcessValue(number));
            }
            else if (dataType == "real")
            {
                double realNum = double.Parse(value);
                Console.WriteLine($"{ProcessValue(realNum):F2}");
            }
            else if (dataType == "string")
            {
                Console.WriteLine(ProcessValue(value));
            }
        }

        static int ProcessValue(int number)
        {
            return number * 2;
        }

        static double ProcessValue(double realNum)
        {
            return realNum * 1.5;
        }

        static string ProcessValue(string word)
        {
            return $"${word}$";
        }
    }
}