package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scanln(&n)
	var sumLeft int = 0
	var sumRight int = 0

	for number := 1; number <= n; number++ {
		var value int
		fmt.Scanln(&value)
		sumLeft += value
	}
	for number := 1; number <= n; number++ {
		var value int
		fmt.Scanln(&value)
		sumRight += value
	}
	if sumLeft == sumRight {
		fmt.Printf("Yes, sum = %d", sumLeft)
	} else {
		fmt.Printf("No, diff = %.0f", math.Abs(float64(sumLeft-sumRight)))
	}
}
