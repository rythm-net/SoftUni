package main

import "fmt"

func main(){
	var n int
	fmt.Scanln(&n)
	for number := n; number >= 1; number-- {
		fmt.Println(number)
	}
}