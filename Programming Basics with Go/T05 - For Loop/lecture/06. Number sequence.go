package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scanln(&n)
	var min int = math.MaxInt32
	var max int = math.MinInt32
	for number := 1; number <= n; number++ {
		var value int
		fmt.Scanln(&value)
		if (value < min) {
            min = value
        }
        if (value > max) {
            max = value
        }
	}
	fmt.Printf("Max number: %d", max)
	fmt.Println()
	fmt.Printf("Min number: %d", min)
}