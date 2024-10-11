package main

import "fmt"

func main() {
	var number int
	fmt.Scanln(&number)


	if number < 100 {
		fmt.Println("Less than 100")
	} else if number <= 200 {
		fmt.Println("Between 100 and 200")
	} else {
		fmt.Println("Greater than 200")
	}
	
}