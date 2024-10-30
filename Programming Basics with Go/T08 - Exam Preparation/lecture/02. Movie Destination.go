package main


import "fmt"


func main () {

	//входни данни
	var budget float32
	fmt.Scanln(&budget)

	var destination string
	fmt.Scanln(&destination)

	var season string
	fmt.Scanln(&season)

	var countDays int
	fmt.Scanln(&countDays)

	//цена за 1 ден
	var pricePerDay float32 = 0

	if season == "Winter" {
		//зима
		//проверка за дестинация - "Dubai", "Sofia" и "London"
		switch destination {
			case "Dubai":
				pricePerDay = 45000
			case "Sofia":
				pricePerDay = 17000
			case "London":
				pricePerDay = 24000
		}

	} else if season == "Summer" {
		//лято
		//проверка за дестинация - "Dubai", "Sofia" и "London"
		switch destination {
			case "Dubai":
				pricePerDay = 40000
			case "Sofia":
				pricePerDay = 12500
			case "London":
				pricePerDay = 20250
		}
	}

	//сума на заснемането = countDays * цена за 1 ден (зависи от сезона и дестинация)
	var totalSum float32 = float32(countDays) * pricePerDay

	//проверка дали нямаме отстъпки / увеличения
	if destination == "Dubai" {
		totalSum = totalSum - 0.3 * totalSum //0.7 * totalSum
	} else if destination == "Sofia" {
		totalSum = totalSum + 0.25 * totalSum //1.25 * totalSum
	}


	//проверка дали бюджетът е достатъчен
	if budget >= totalSum {
		var leftMoney float32 = budget - totalSum
		fmt.Printf("The budget for the movie is enough! We have %.2f leva left!", leftMoney)
	} else {
		//budget < totalSum
		var needMoney float32 = totalSum - budget
		fmt.Printf("The director needs %.2f leva more!", needMoney)
	}
}