package main

import (
	"fmt"
	"math"
)

func main (){
	var figureType string
	fmt.Scanln(&figureType)

	var firstParameter float32
	fmt.Scanln(&firstParameter)

	var area float32
	if figureType == "square" {
		area = float32(math.Pow(float64(firstParameter), 2))
	} else if figureType == "rectangle" {
		var secondParameter float32
		fmt.Scanln(&secondParameter)
		area = firstParameter * secondParameter
	} else if figureType == "circle" {
		area = float32(math.Pi * math.Pow(float64(firstParameter), 2))
	}else if figureType == "triangle" {
		var secondParameter float32
		fmt.Scanln(&secondParameter)
		area = firstParameter * secondParameter / 2
	}
	fmt.Printf("%.3f", area)
}