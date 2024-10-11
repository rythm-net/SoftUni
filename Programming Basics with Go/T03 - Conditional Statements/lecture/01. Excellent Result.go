package main

import "fmt"

func main() {
	var grade int
	fmt.Scanln(&grade)

	if grade >= 5 {
		fmt.Println("Excellent!")
	}

}