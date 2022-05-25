using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05._Shopping_Spree
{
    public class Product
    {
        public Product(string productName, decimal productCost)
        {
            this.ProductName = productName;
            this.Cost = productCost;
        }

        public string ProductName { get; set; }
        public decimal Cost { get; set; }
    }
}