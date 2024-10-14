package main

import "fmt"

func main () {

	var dayOfWeek string
	fmt.Scanln(&dayOfWeek)

	//Monday, Tuesday, Friday -> 12
	//Wednesday, Thursday -> 14
	//Saturday, Sunday -> 16

	switch dayOfWeek {
		case "Monday", "Tuesday", "Friday":
			fmt.Print(12)
		case "Wednesday", "Thursday":
			fmt.Print(14)
		case "Saturday", "Sunday":
			fmt.Print(16)
	}
}