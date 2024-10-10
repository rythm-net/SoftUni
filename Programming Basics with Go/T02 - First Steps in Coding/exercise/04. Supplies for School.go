package main

import "fmt"

func main() {
	var countPens, countMarkers, litersSpray, percent int
	fmt.Scanln(&countPens)
	fmt.Scanln(&countMarkers)
	fmt.Scanln(&litersSpray)
	fmt.Scanln(&percent)

	var pricePens float32 = float32(countPens) * 5.80
	var priceMarkers float32 = float32(countMarkers) * 7.20
	var priceSpray float32 = float32(litersSpray) * 1.20
	var totalPrice = pricePens + priceMarkers + priceSpray
	var finalPrice = totalPrice - (totalPrice * (float32(percent) / 100.0))

	fmt.Print(finalPrice)
}