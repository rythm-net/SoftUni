package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scan(&n)

	var sum int = 0
	var max = math.MinInt32
	for number := 1; number <= n; number++ {
		var value int
		fmt.Scan(&value)
		if max < value {
			max = value
		}
		sum += value
	}

	var diff int = sum - max

	if diff == max {
		fmt.Printf("Yes\nSum = %d", max)
	} else {
		fmt.Printf("No\nDiff = %v", int(math.Abs(float64(max - diff))))
	}

}
