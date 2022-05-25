using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05._Shopping_Spree
{
    public class Person
    {
        public Person(string name, decimal money)
        {
            this.Name = name;
            this.Money = money;
            this.BagOfProducts = new List<string>();
        }

        public string Name { get; set; }
        public decimal Money { get; set; }
        public List<string> BagOfProducts { get; set; }
    }
}