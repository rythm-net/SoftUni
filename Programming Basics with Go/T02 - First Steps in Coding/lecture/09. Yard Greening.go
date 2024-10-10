package main

import "fmt"

func main() {
	var sqm float32
	fmt.Scanln(&sqm)

	var totalPrice float32 = sqm * 7.61
	var discount float32 = totalPrice * 0.18
	var leftSum float32 = totalPrice - discount

	fmt.Printf("The final price is: %f lv.\n", leftSum)
	fmt.Printf("The discount is: %f lv.", discount)
}