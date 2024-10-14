package main

import "fmt"

func main () {
	var number int
	fmt.Scanln(&number)

	//1. [-100; 100] -> number >= -100 и number <= 100
	//2. не е 0 -> number != 0

	if number >= -100 && number <= 100 && number != 0 {
		fmt.Print("Yes")
	} else {
		fmt.Print("No")
	}

}