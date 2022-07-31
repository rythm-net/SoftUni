using System;

public class Program
{
	public static void Main()
	{
		int n = int.Parse(Console.ReadLine());
		int hearthstone = 0;
		int fornite = 0;
		int overwatch = 0;
		int others = 0;

		for (int i = 1; i <= n; i++)
		{
			string input = Console.ReadLine();
			switch (input)
			{
				case "Hearthstone": hearthstone++; break;
				case "Fornite": fornite++; break;
				case "Overwatch": overwatch++; break;
				default: others++; break;
			}
		}

		Console.WriteLine("Hearthstone - {0:f2}%", hearthstone * 100.0 / n);
		Console.WriteLine("Fornite - {0:f2}%", fornite * 100.0 / n);
		Console.WriteLine("Overwatch - {0:f2}%", overwatch * 100.0 / n);
		Console.WriteLine("Others - {0:f2}%", others * 100.0 / n);
	}
}