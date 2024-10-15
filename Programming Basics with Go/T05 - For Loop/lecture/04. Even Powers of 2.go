package main

import "fmt"
import "math"

func main() {

	var n int

	fmt.Scanln(&n)

	for power := 0; power <= n; power += 2 {
		fmt.Println(math.Pow(2, float64(power)))
	}

}