package main

import (
	"fmt"
	"math"
)

func main() {
	var radians float32
	fmt.Scanln(&radians)

	var degrees float32 = radians * 180 / math.Pi
	fmt.Println(degrees)
}