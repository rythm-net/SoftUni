package main

import (
	"fmt"
	"strconv"
)

func main() {

	//входни данни (текст): "GoingHome" или извървяни стъпки ("123")
	//спираме: входни данни == "GoingHome"
	//продължаваме: входни данни != "GoingHome"

	var targetSteps int = 10000  //целеви стъпки
	var totalWalkedSteps int = 0 //общо извървяни стъпки

	var input string
	fmt.Scanln(&input)

	for input != "GoingHome" {
		//извървяни стъпки ("567")
		//input = "445"
		walkedSteps, _ := strconv.Atoi(input) //текущи извървяни стъпки

		//добавяме към общия бр извървяни стъпки
		totalWalkedSteps += walkedSteps

		//проверка дали стигаме целта
		if totalWalkedSteps >= targetSteps {
			fmt.Println("Goal reached! Good job!")
			fmt.Printf("%d steps over the goal!", totalWalkedSteps-targetSteps)
			break
		}

		fmt.Scanln(&input)
	}

	if input == "GoingHome" {
		var stepsToHome int
		fmt.Scanln(&stepsToHome)
		totalWalkedSteps += stepsToHome
		//след прибирането е успяла да стигне 10000
		if totalWalkedSteps >= targetSteps {
			fmt.Println("Goal reached! Good job!")
			fmt.Printf("%d steps over the goal!", totalWalkedSteps-targetSteps)
		} else {
			//не е успяла -> totalWalkedSteps < targetSteps
			fmt.Printf("%d more steps to reach goal.", targetSteps-totalWalkedSteps)
		}

	}
}
