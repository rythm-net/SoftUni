package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scanln(&n)

	var sumEven int = 0
	var sumOdd int = 0

	for number := 1; number <= n; number++ {
		var value int
		fmt.Scanln(&value)
		if number % 2 == 0 {
			sumEven += value
		} else {
			sumOdd += value
		}
	}
	var diff int = int(math.Abs(float64(sumEven) - float64(sumOdd)))
	if diff == 0 {
		fmt.Println("Yes")
		fmt.Printf("Sum = %d", sumEven)
	} else {
		fmt.Println("No")
		fmt.Printf("Diff = %d", diff)
	}
}
