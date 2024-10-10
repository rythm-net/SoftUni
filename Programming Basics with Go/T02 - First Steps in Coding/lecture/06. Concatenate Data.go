package main

import "fmt"

func main() {
	//1. 4 променливи
	var firstName string
	fmt.Scanln(&firstName)

	var lastName string
	fmt.Scanln(&lastName)

	var age int
	fmt.Scanln(&age)

	var town string
	fmt.Scanln(&town)

	//2. отпечатваме: "You are <firstName> <lastName>, a <age>-years old person from <town>."
	fmt.Printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
}