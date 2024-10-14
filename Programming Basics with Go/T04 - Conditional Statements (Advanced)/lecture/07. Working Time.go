package main

import "fmt"

func main() {
	var hour int
	fmt.Scanln(&hour)

	var day string
	fmt.Scanln(&day)

	//отворен -> час е от 10 до 18 и деня е от пон до събота
	//затворен -> час < 10 или час > 18 или деня е неделя

	if hour < 10 || hour > 18 || day == "Sunday" {
		fmt.Print("closed")
	} else {
		fmt.Print("open")
	}



}