package main

import "fmt"

func main () {
	var degrees int 
	fmt.Scanln(&degrees)

	var partOfDay string
	fmt.Scanln(&partOfDay)

	var outfit string = "" //дрехите
	var shoes string = ""  //обувки

	if degrees >= 10 && degrees <= 18 {
		//проверка за част от деня -> "Morning", "Afternoon", "Evening"
		switch partOfDay {
			case "Morning":
				outfit = "Sweatshirt"
				shoes = "Sneakers"
			case "Afternoon", "Evening":
				outfit = "Shirt"
				shoes = "Moccasins"
		}
	} else if degrees > 18 && degrees <= 24 {
		//проверка за част от деня -> "Morning", "Afternoon", "Evening"
		switch partOfDay {
			case "Morning", "Evening":
				outfit = "Shirt"
				shoes = "Moccasins"
			case "Afternoon":
				outfit = "T-Shirt"
				shoes = "Sandals"
		}
	} else if degrees >= 25 {
		//проверка за част от деня -> "Morning", "Afternoon", "Evening"
		switch partOfDay {
			case "Morning":
				outfit = "T-Shirt"
				shoes = "Sandals"
			case "Afternoon":
				outfit = "Swim Suit"
				shoes = "Barefoot"
			case "Evening":
				outfit = "Shirt"
				shoes = "Moccasins"
		}

	}

	//знам облекло и обувки
	fmt.Printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes)

}
