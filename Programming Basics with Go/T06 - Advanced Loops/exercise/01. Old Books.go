package main

import "fmt"

func main() {
	var searchedBook string
	fmt.Scanln(&searchedBook)

	var inputBook string
	fmt.Scanln(&inputBook)

	var count int = 0
	var isFound bool = false
	for inputBook != "NoMoreBooks" {
		if inputBook == searchedBook {
			fmt.Printf("You checked %d books and found it.", count)
			isFound = true
			break
		}
		count++
		fmt.Scanln(&inputBook)
	}
	
	if !isFound {
		fmt.Println("The book you search is not here!")
		fmt.Printf("You checked %d books.", count)
	}
}
