package main

import "fmt"

func main() {

	var n int
	fmt.Scanln(&n)

	var sum int = 0

	for number := 1; number <= n; number++ {
		var value int
		fmt.Scanln(&value)
		sum += value
	}
	fmt.Print(sum)

}