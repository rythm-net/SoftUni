using System;

namespace _04._Tribonacci_Sequence
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            TribonacciSequence(num);
        }

        static void TribonacciSequence(int num)
        {
            int currentNum = 0;
            int firstNum   = 1;
            int secondNum  = 1;
            int thirdNum   = 2;

            for (int i = 1; i <= num; i++)
            {
                if (i == 1)
                {
                    Console.Write("{0} ", firstNum);
                }
                else if (i == 2)
                {
                    Console.Write("{0} ", secondNum);
                }
                else if (i == 3)
                {
                    Console.Write("{0} ", thirdNum);
                }
                else
                {
                    currentNum = thirdNum + secondNum + firstNum;

                    firstNum = secondNum;
                    secondNum = thirdNum;
                    thirdNum = currentNum;

                    Console.Write("{0} ", currentNum);
                }
            }
        }
    }
}