package main

import "fmt"

func main() {

	var age float32
	fmt.Scanln(&age)

	var gender string
	fmt.Scanln(&gender)

	//switch  {} -> серия от различни проверки

	//мъж -> < 16 или >= 16
	//жена -> < 16 или >= 16

	if gender == "m" {
		//мъж
		//проверка за възрастта -> < 16; >= 16
		switch {
			case age < 16:
				fmt.Print("Master")
			case age >= 16:
				fmt.Print("Mr.")
		}
	} else if gender == "f" {
		//жена
		//проверка за възрастта
		if age < 16 {
			fmt.Print("Miss")
		} else {
			// >= 16
			fmt.Print("Ms.")
		}
	}



}