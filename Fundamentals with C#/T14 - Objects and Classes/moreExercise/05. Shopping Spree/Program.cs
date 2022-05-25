using System;
using System.Collections.Generic;

namespace _05._Shopping_Spree
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Person> people = new List<Person>();
            List<Product> products = new List<Product>();

            string[] personArgs = Console.ReadLine().Split(';', StringSplitOptions.RemoveEmptyEntries);
            PopulatePeopleList(personArgs, people);
            string[] productArgs = Console.ReadLine().Split(';', StringSplitOptions.RemoveEmptyEntries);
            PopulateProductList(productArgs, products);

            string input;

            while ((input = Console.ReadLine()) != "END")
            {
                string[] commandArgs = input.Split(' ', StringSplitOptions.RemoveEmptyEntries);
                string personName = commandArgs[0];
                string productName = commandArgs[1];

                var selectPerson = people.Find(p => p.Name == personName);
                var selectProduct = products.Find(p => p.ProductName == productName);

                if (selectPerson == null || selectProduct == null)
                {
                    continue;
                }

                if (selectPerson.Money >= selectProduct.Cost)
                {
                    selectPerson.Money -= selectProduct.Cost;
                    selectPerson.BagOfProducts.Add(selectProduct.ProductName);
                    Console.WriteLine($"{selectPerson.Name} bought {selectProduct.ProductName}");
                }
                else
                {
                    Console.WriteLine($"{selectPerson.Name} can't afford {selectProduct.ProductName}");
                }
            }

            foreach (var person in people)
            {
                Console.WriteLine($"{person.Name} - {(person.BagOfProducts.Count > 0 ? string.Join(", ", person.BagOfProducts) : "Nothing bought")}");
            }
        }

        static void PopulatePeopleList(string[] personArgs, List<Person> people)
        {
            foreach (var person in personArgs)
            {
                string[] personParams = person.Split('=', StringSplitOptions.RemoveEmptyEntries);
                string name = personParams[0];
                decimal money = decimal.Parse(personParams[1]);

                var newPerson = new Person(name, money);
                people.Add(newPerson);
            }
        }

        static void PopulateProductList(string[] productArgs, List<Product> products)
        {
            foreach (var product in productArgs)
            {
                string[] productParams = product.Split('=', StringSplitOptions.RemoveEmptyEntries);
                string productName = productParams[0];
                decimal productCost = decimal.Parse(productParams[1]);

                var newProduct = new Product(productName, productCost);
                products.Add(newProduct);
            }
        }
    }
}