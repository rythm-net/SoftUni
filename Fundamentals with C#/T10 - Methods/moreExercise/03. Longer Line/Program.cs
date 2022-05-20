using System;
using System.Collections.Generic;

namespace _03._Longer_Line
{
    class CoordinatesPlane
    {
        public CoordinatesPlane(double x1, double y1, double x2, double y2)
        {
            this.X1 = x1;
            this.Y1 = y1;
            this.X2 = x2;
            this.Y2 = y2;
        }

        public double X1 { get; set; }
        public double Y1 { get; set; }
        public double X2 { get; set; }
        public double Y2 { get; set; }

        public double GetLineLength()
        {
            return Math.Pow(X1 - X2, 2) + Math.Pow(Y1 - Y2, 2);
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            List<CoordinatesPlane> plane = new List<CoordinatesPlane>();

            for (int i = 0; i < 2; i++)
            {
                double x1 = double.Parse(Console.ReadLine());
                double y1 = double.Parse(Console.ReadLine());
                double x2 = double.Parse(Console.ReadLine());
                double y2 = double.Parse(Console.ReadLine());

                CoordinatesPlane newLine = new CoordinatesPlane(x1, y1, x2, y2);
                plane.Add(newLine);
            }

            double firstLineLength = plane[0].GetLineLength();
            double secondLineLength = plane[1].GetLineLength();

            if (firstLineLength > secondLineLength)
            {
                ClosestPoint(plane[0].X1, plane[0].Y1, plane[0].X2, plane[0].Y2);
            }
            else
            {
                ClosestPoint(plane[1].X1, plane[1].Y1, plane[1].X2, plane[1].Y2);
            }
        }

        static void ClosestPoint(double x1, double y1, double x2, double y2)
        {
            double firstPoint = Math.Pow(x1, 2) + Math.Pow(y1, 2);
            double secondPoint = Math.Pow(x2, 2) + Math.Pow(y2, 2);

            if (firstPoint <= secondPoint)
            {
                Console.WriteLine($"({x1}, {y1})({x2}, {y2})");
            }
            else
            {
                Console.WriteLine($"({x2}, {y2})({x1}, {y1})");
            }
        }
    }
}