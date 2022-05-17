using System;
using System.Linq;

namespace _09._Kamino_Factory
{
    class Program
    {
        static void Main(string[] args)
        {
            int dnaLength = int.Parse(Console.ReadLine());

            string input;
            int longestSequence = 0;
            int startingSubsequence = 0;
            int bestSum = 0;
            int dnaSampleCount = 0;
            int bestDnaSampleCount = 0;

            int[] dnaSequence = new int[dnaLength];
            int[] bestDnaSample = new int[dnaLength];

            while ((input = Console.ReadLine()) != "Clone them!")
            {
                dnaSequence = input.Split('!', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
                dnaSampleCount++;
                int sequenceLength = 0;

                for (int i = 0; i < dnaSequence.Length - 1; i++)
                {
                    int sequenceSum = 0;

                    for (int j = 0; j < dnaSequence.Length; j++)
                    {
                        sequenceSum += dnaSequence[j];
                    }

                    if (dnaSequence[i] == dnaSequence[i + 1])
                    {
                        sequenceLength++;

                        if (sequenceLength > longestSequence)
                        {
                            bestDnaSampleCount = dnaSampleCount;
                            startingSubsequence = i;
                            longestSequence = sequenceLength;
                            bestDnaSample = dnaSequence;
                            bestSum = sequenceSum;
                        }

                        else if (sequenceLength == longestSequence)
                        {
                            if (startingSubsequence == i)
                            {
                                if (sequenceSum > bestSum)
                                {
                                    bestSum = sequenceSum;
                                    bestDnaSampleCount = dnaSampleCount;
                                    bestDnaSample = dnaSequence;
                                    break;
                                }
                            }

                            else if (startingSubsequence > i)
                            {
                                bestSum = sequenceSum;
                                bestDnaSampleCount = dnaSampleCount;
                                bestDnaSample = dnaSequence;
                                break;
                            }
                        }
                    }

                    else
                    {
                        sequenceLength = 0;
                    }
                }
            }
            Console.WriteLine($"Best DNA sample {bestDnaSampleCount} with sum: {bestSum}. \n{string.Join(' ', bestDnaSample)}");
        }
    }
}