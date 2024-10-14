package main

import "fmt"

func main () {
	var dayOfWeek string
	fmt.Scanln(&dayOfWeek)

	//Monday, Tuesday, Wednesday, Thursday, Friday -> Working day
	//Saturday, Sunday -> Weekend
	//other -> Error

	//switch {име на променлива} -> проверява само точни стойности за променливата

	switch dayOfWeek {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
			fmt.Print("Working day")
		case "Saturday", "Sunday":
			fmt.Print("Weekend")
		default:
			fmt.Print("Error")
	}



}