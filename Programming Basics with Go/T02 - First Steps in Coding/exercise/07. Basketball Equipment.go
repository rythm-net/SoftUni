package main

import "fmt"

func main () {
	var annualTax int
	fmt.Scanln(&annualTax)

	var trainers float32 = float32(annualTax) * 0.6
	var suit float32 = float32(trainers) * 0.8
	var ball float32 = suit / 4.0
	var accessories float32 = ball / 5.0

	var totalPrice float32 = trainers + suit + ball + accessories + float32(annualTax)

	fmt.Println(totalPrice)

}