package main

import "fmt"

func main() {
	var countChicken, countFish, countVegan int
	fmt.Scanln(&countChicken)
	fmt.Scanln(&countFish)
	fmt.Scanln(&countVegan)

	var sumChicken float32 = float32(countChicken) * 10.35
	var sumFish float32 = float32(countFish) * 12.40
	var sumVegan float32 = float32(countVegan) * 8.15

	var sumMenus float32 = sumChicken + sumFish + sumVegan
	var priceDesert float32 = 0.2 * sumMenus
	var delivery float32 = 2.50
	var totalPrice float32 = priceDesert + sumMenus + delivery

	fmt.Print(totalPrice)
}