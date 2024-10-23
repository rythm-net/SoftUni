package main

import (
	"fmt"
	"strconv"
)

func main4() {

	//входни данни (текст): "stop" или число под формата на текст ("200")
	var input string
	fmt.Scanln(&input)

	var sumPrime, sumNonPrime int = 0, 0
	
	//спираме: input == "stop"
	//продължаваме: input != "stop"

	for input != "stop" {
		//input e число под формата на текст
		//input = "345"
		//текст -> цяло число
		number, _ := strconv.Atoi(input) //въведено число

		if number < 0 {
			fmt.Println("Number is negative.")
		} else {
			//number >= 0
			//проверка дали е просто или съставно
			var count int = 0 //бр. делителите
			//всички числа от 1 до моето
			for i := 1; i <= number; i++ {
				if number % i == 0 {
					count++
				}	
			}
			//знам колко е бр. делителите
			//ако числото е просто (бр. делители == 2) -> добавям го към sumPrime
			if count == 2 {
				sumPrime += number
			} else {
				//ако числото не е просто (съставно) -> добавям към sumNonPrime
				sumNonPrime += number
			}
		}
		fmt.Scanln(&input) //въвеждаме нови входни данни
	}

	fmt.Printf("Sum of all prime numbers is: %d\n", sumPrime)
	fmt.Printf("Sum of all non prime numbers is: %d", sumNonPrime)


}