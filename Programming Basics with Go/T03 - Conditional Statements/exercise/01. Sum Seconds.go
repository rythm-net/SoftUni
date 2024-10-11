package main

import "fmt"

func main () {

	//1. входни данни - време 1 (сек), време 2 (сек), време 3 (сек)
	//2. сума от времената (сек) = време 1 + време 2 + време 3
	//3. минути = сума / 60
	//4. секунди = сума % 60
	//5. отпечатвам -> минути:секунди
	//5.1. секунди < 10 -> минути:0секунди
	//5.2. секунди >= 10 -> минути:секунди

	var time1, time2, time3 int
	fmt.Scanln(&time1)
	fmt.Scanln(&time2)
	fmt.Scanln(&time3)

	var sum int = time1 + time2 + time3
	var minutes int = sum / 60
	var seconds int = sum % 60

	if seconds < 10 {
		//минути:0секунди
		fmt.Printf("%d:0%d", minutes, seconds)
	} else { 
		// seconds >= 10
		//минути:секунди
		fmt.Printf("%d:%d", minutes, seconds)
	}


}