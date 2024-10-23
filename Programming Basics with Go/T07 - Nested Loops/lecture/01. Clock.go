package main

import "fmt"

func main1() {

	//за всеки един час от 0 до 23
	for hour := 0; hour <= 23; hour++ {
		//всяка минута от 0 до 59
		for minutes := 0; minutes <= 59; minutes++ {
			fmt.Printf("%d:%d\n", hour, minutes)
		}
	}
}