package main

import "fmt"


func main () {
	

	var budget int
	fmt.Scanln(&budget)

	var season string
	fmt.Scanln(&season) //"Spring", "Summer", "Autumn", "Winter"

	var countFishers int 
	fmt.Scanln(&countFishers)

	//1. наем на лодката -> зависи от сезона
	var rent float32 = 0
	switch season {
		case "Spring":
			rent = 3000
		case "Autumn", "Summer":
			rent = 4200
		case "Winter":
			rent = 2600

	}
	//знам наем на лодката

	//2. отстъпка -> спрямо бр. рибари
	if countFishers <= 6 {
		//10% отстъпка
		rent = rent - 0.10 * rent //0.9 * rent
	} else if countFishers >= 7 && countFishers <= 11 {
		//15% отстъпка
		rent = rent - 0.15 * rent //0.85 * rent
	} else if countFishers >= 12 {
		//25% отстъпка
		rent = rent - 0.25 * rent
	}

	//3. допълнителна отстъпка -> четен брой рибари и сезонът не е есен
	if countFishers % 2 == 0 && season != "Autumn" {
		//5% отстъпка
		rent = rent - 0.05 * rent // 0.95 * rent
	}

	//4. крайния наем след остъпки -> проверка дали се покрива от бюджетът
	//достатъчен бюджет
	if float32(budget) >= rent {
		var leftMoney float32 = float32(budget) - rent
		fmt.Printf("Yes! You have %.2f leva left.", leftMoney)
	} else {
		//не е достатъчен
		var needMoney float32 = rent - float32(budget)
		fmt.Printf("Not enough money! You need %.2f leva.", needMoney)
	}


}