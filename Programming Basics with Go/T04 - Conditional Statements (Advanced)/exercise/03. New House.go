package main

import "fmt"

func main() {
	var typeFlower string
	fmt.Scanln(&typeFlower)

	var count, budget int
	fmt.Scanln(&count)
	fmt.Scanln(&budget)

	var total float64 = 0

	switch typeFlower {
		case "Roses":
			total = float64(count) * 5
			if count > 80 {
				total = total * 0.9
			}
			break
		case "Dahlias":
			total = float64(count) * 3.8
			if count > 90 {
				total = total * 0.85
			}
			break
		case "Tulips":
			total = float64(count) * 2.8
			if count > 80 {
				total = total * 0.85
			}
			break
		case "Narcissus":
			total = float64(count) * 3
			if count < 120 {
				total = total * 1.15
			}
			break
		case "Gladiolus":
			total = float64(count) * 2.5
			if count < 80 {
				total = total * 1.2
			}
			break
	}

	if float64(budget) >= total {
		var leftMoney = float64(budget) - total
		fmt.Printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, typeFlower, leftMoney)
	} else {
		var needMoney = total - float64(budget)
		fmt.Printf("Not enough money, you need %.2f leva more.", needMoney)
	}
}
