package main

import "fmt"

func main() {
	var number int
	fmt.Scanln(&number)


	if number % 2 == 0 {
		fmt.Println("even")
	} else {
		fmt.Println("odd")
	}
}