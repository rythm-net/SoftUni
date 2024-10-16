package main

import (
	"fmt"
	"math"
)

func main() {
	var age, priceToy int
	fmt.Scanln(&age)
	var priceWashingMachine float64
	fmt.Scanln(&priceWashingMachine)
	fmt.Scanln(&priceToy)

	var savedMoney float64 = 0
	var countJoys int = 0

	for birthday := 1; birthday <= age; birthday++ {
		if birthday % 2 == 0 {
			savedMoney += float64(birthday) * 5
			savedMoney--
		} else {
			countJoys++
		}
	}
	
	savedMoney += (float64(countJoys) * float64(priceToy))
	var diff float64 = math.Abs(savedMoney - priceWashingMachine)
	if savedMoney >= priceWashingMachine {
		fmt.Printf("Yes! %.2f", diff)
	} else {
		fmt.Printf("No! %.2f", diff)
	}
}
