package main


import "fmt"

func main1() {
	var firstNumber, secondNumber int
	fmt.Scanln(&firstNumber)
	fmt.Scanln(&secondNumber)

	//всички числа firstNumber до secondNumber
	for number := firstNumber; number <= secondNumber; number++ {
		//проверка на позициите
		//134528
		//8 -> единиците
		var units int = number % 10
		//2 -> десетици
		var tens int = number / 10 % 10
		//5 -> стотици
		var hundreds int = number / 100 % 10
		//4 -> хилядни
		var thousands int = number / 1000 % 10
		//3 -> десетохилядни
		var tenThoudsands int = number / 10000 % 10
		//1 -> стохилядни
		var hundredThousands int = number / 100000

		//единици + стотици + десетохилядни == десетици + хилядни + стохилядни
		if units + hundreds + tenThoudsands == tens + thousands + hundredThousands {
			fmt.Printf("%d ", number)
		}
	}
}