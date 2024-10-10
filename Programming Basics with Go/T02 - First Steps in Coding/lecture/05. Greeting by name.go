package main

import "fmt"

func main() {
	//1. име -> въвежда
	//2. отпчетвам: "Hello, <name>!"
	var name string
	fmt.Scanln(&name)

	fmt.Println("Hello, " + name + "!")
}