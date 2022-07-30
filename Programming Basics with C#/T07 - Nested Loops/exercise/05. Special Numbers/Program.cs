using System;

internal class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        for (int i = 1111; i <= 9999; i++)
        {
            bool special = true;
            string str = i.ToString();

            for (int j = 0; j <= 3; j++)
            {
                string digit = str[j].ToString(); ;
                int num = int.Parse(digit);

                if (num == 0)
                {
                    special = false;
                }
                else if (n % num != 0) special = false;
            }
            if (special) Console.Write($"{i} ");
        }
    }
}