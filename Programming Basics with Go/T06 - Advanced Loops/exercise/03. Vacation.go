package main

import "fmt"

func main() {

	var tripPrice, currentMoney float32
	fmt.Scanln(&tripPrice)
	fmt.Scanln(&currentMoney)

	var countAllDays int = 0 //общо всички дни с действия
	var countSpendDays int = 0 //последователни дни, в които харчи

	//повтаряме: спестяване / харчене на пари
	//спираме: currentMoney >= tripPrice
	//продължавам: currentMoney < tripPrice

	for currentMoney < tripPrice {
		//спестявам или харча
		var action string
		fmt.Scanln(&action) //"spend" или "save"
		var sum float32
		fmt.Scanln(&sum) //пари за харчене / спестяване

		countAllDays++

		if action == "save" {
			//спестявам
			currentMoney += sum
			countSpendDays = 0
		} else if action == "spend" {
			//харчим
			countSpendDays++
			currentMoney -= sum

			//дали харчим повече отколкото имаме
			if currentMoney < 0 {
				currentMoney = 0
			}

			//дали 5 последователни дни на харчене
			if countSpendDays == 5 {
				fmt.Println("You can't save the money.")
				fmt.Println(countAllDays)
				break
			}
		}
	}

	if currentMoney >= tripPrice {
		//събира парите за екскурзията
		fmt.Printf("You saved the money for %d days.", countAllDays)
	}
}
