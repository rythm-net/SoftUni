package main

import "fmt"

func main() {
	var depositSum float32
	fmt.Scanln(&depositSum)

	var months int
	fmt.Scanln(&months)

	var percent float32
	fmt.Scanln(&percent)

	var sum = depositSum + float32(months) * ( (depositSum * (percent / 100.00)) / 12)
	fmt.Print(sum)
}