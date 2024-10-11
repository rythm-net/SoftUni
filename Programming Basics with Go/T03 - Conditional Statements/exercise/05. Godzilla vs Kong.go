package main

import "fmt"

func main () {
    var budget float32
	fmt.Scanln(&budget)

	var countStatists int
	fmt.Scanln(&countStatists)

	var pricePerStatist float32
	fmt.Scanln(&pricePerStatist)

	var decor float32 = 0.10 * budget
	var priceClothes = pricePerStatist * float32 (countStatists)

	if countStatists > 150 {
		priceClothes = priceClothes - 0.1 * priceClothes
	}

	var totalPrice = decor + priceClothes

	if totalPrice > budget {
		fmt.Println("Not enough money!")
		var needMoney float32 = totalPrice - budget
		fmt.Printf("Wingard needs %.2f leva more.", needMoney)
	} else {
		fmt.Println("Action!")
		var leftMoney float32 = budget - totalPrice
		fmt.Printf("Wingard starts filming with %.2f leva left.", leftMoney)
	}

}